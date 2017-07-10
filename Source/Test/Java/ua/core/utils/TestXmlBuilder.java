package ua.core.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestXmlBuilder {
	
	@Test
	public void basic() {
		
		XmlBuilder xmlBuilder = new XmlBuilder ("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
		
		xmlBuilder.openTag ("xml").add ("node", "value").closeTag();
		
		assertEquals ("<?xml version=\"1.0\" encoding=\"utf-8\"?><xml><node>value</node></xml>", xmlBuilder.toString());
	}
	
	@Test
	public void addElement_Normal() {
		
		XmlBuilder xmlBuilder = new XmlBuilder();
		
		xmlBuilder.openTag ("xml");
		xmlBuilder.add ("node", "value");
		xmlBuilder.closeTag();
		
		assertEquals ("<xml><node>value</node></xml>", xmlBuilder.toString());
	}
	
	@Test
	public void addElement_Empty() {
		
		XmlBuilder xmlBuilder = new XmlBuilder();
		
		xmlBuilder.openTag ("xml").add ("node", "").closeTag();
		
		assertEquals ("<xml><node></node></xml>", xmlBuilder.toString());
	}

	@Test
	public void addElement_Null() {
		
		XmlBuilder xmlBuilder = new XmlBuilder();
		
		xmlBuilder.openTag ("xml").add ("node", null).closeTag();
		
		assertEquals ("<xml><node></node></xml>", xmlBuilder.toString());
	}
	
	@Test
	public void addEscapedElement_Normal() {
		
		XmlBuilder xmlBuilder = new XmlBuilder();
		
		xmlBuilder.openTag ("xml");
		xmlBuilder.add ("node", "value");
		xmlBuilder.closeTag();
		
		assertEquals ("<xml><node>value</node></xml>", xmlBuilder.toString());
	}
	
	@Test
	public void addEscapedElement_NormalEscaped() {
		
		XmlBuilder xmlBuilder = new XmlBuilder();
		
		xmlBuilder.openTag ("xml").addEscaped ("node", "<value&>").closeTag();
		
		assertEquals ("<xml><node>&lt;value&amp;&gt;</node></xml>", xmlBuilder.toString());
	}
	
	@Test
	public void addEscapedElement_Null() {
		
		XmlBuilder xmlBuilder = new XmlBuilder();
		
		xmlBuilder.openTag ("xml");
		xmlBuilder.addEscaped ("node", null);
		xmlBuilder.closeTag();
		
		assertEquals ("<xml><node></node></xml>", xmlBuilder.toString());
	}

	
	@Test
	public void addEscapedNonNullElement_Normal() {
		
		XmlBuilder xmlBuilder = new XmlBuilder();
		
		xmlBuilder.openTag ("xml");
		xmlBuilder.addEscapedNotEmpty ("node", "value");
		xmlBuilder.closeTag();
		
		assertEquals ("<xml><node>value</node></xml>", xmlBuilder.toString());
	}
	
	@Test
	public void addEscapedNonNullElement_NormalEscaped() {
		
		XmlBuilder xmlBuilder = new XmlBuilder();
		
		xmlBuilder.openTag ("xml");
		xmlBuilder.addEscapedNotEmpty ("node", "val<ue&>");
		xmlBuilder.closeTag();
		
		assertEquals ("<xml><node>val&lt;ue&amp;&gt;</node></xml>", xmlBuilder.toString());
	}
	
	@Test
	public void addEscapedNonNullElement_Null() {
		
		XmlBuilder xmlBuilder = new XmlBuilder();
		
		xmlBuilder.openTag ("xml");
		xmlBuilder.addEscapedNotEmpty ("node", null);
		xmlBuilder.closeTag();
		
		assertEquals ("<xml></xml>", xmlBuilder.toString());
	}


	@Test
	public void addInteger() {
		
		XmlBuilder xmlBuilder = new XmlBuilder ("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
		
		xmlBuilder.openTag ("xml").add ("node", 12345).closeTag();
		
		assertEquals ("<?xml version=\"1.0\" encoding=\"utf-8\"?><xml><node>12345</node></xml>", xmlBuilder.toString());
	}
	

	@Test
	public void addLong() {
		
		XmlBuilder xmlBuilder = new XmlBuilder ("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
		
		xmlBuilder.openTag ("xml").add ("node", 10234L).closeTag();
		
		assertEquals ("<?xml version=\"1.0\" encoding=\"utf-8\"?><xml><node>10234</node></xml>", xmlBuilder.toString());
	}
	

	@Test
	public void addNonEmptyElement_Normal() {
		
		XmlBuilder xmlBuilder = new XmlBuilder();
		
		xmlBuilder.openTag ("xml").addNotEmpty ("node", "value").closeTag();
		
		assertEquals ("<xml><node>value</node></xml>", xmlBuilder.toString());
	}
	
	@Test
	public void addNonEmptyElement_Empty() {
		
		XmlBuilder xmlBuilder = new XmlBuilder();
		
		xmlBuilder.openTag ("xml");
		xmlBuilder.addNotEmpty ("node", "");
		xmlBuilder.closeTag();
		
		assertEquals ("<xml></xml>", xmlBuilder.toString());
	}
	
	@Test
	public void addNonEmptyElement_Null() {
		
		XmlBuilder xmlBuilder = new XmlBuilder();
		
		xmlBuilder.openTag ("xml");
		xmlBuilder.addNotEmpty ("node", null);
		xmlBuilder.closeTag();
		
		assertEquals ("<xml></xml>", xmlBuilder.toString());
	}

	@Test
	public void addTag_WithAttributes() {
		
		XmlBuilder xmlBuilder = new XmlBuilder();
		
		xmlBuilder.openTag ("xml", "attributes=\"some data\"");
		xmlBuilder.add ("node", "value");
		xmlBuilder.closeTag();
		
		assertEquals ("<xml attributes=\"some data\"><node>value</node></xml>", xmlBuilder.toString());
	}
}
