package ua.core.utils;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestXmlUtils {

	
	@Test
	public void appendEscapedElement_Normal() {
		
		StringBuilder xmlBuffer = new StringBuilder();
		
		xmlBuffer.append ("<xml>");
		XmlUtils.appendEscapedElement (xmlBuffer, "node", "value");
		xmlBuffer.append ("</xml>");
		
		assertEquals ("<xml><node>value</node></xml>", xmlBuffer.toString());
	}
	
	@Test
	public void appendEscapedElement_NormalEscaped() {
		
		StringBuilder xmlBuffer = new StringBuilder();
		
		xmlBuffer.append ("<xml>");
		XmlUtils.appendEscapedElement (xmlBuffer, "node", "<value&>");
		xmlBuffer.append ("</xml>");
		
		assertEquals ("<xml><node>&lt;value&amp;&gt;</node></xml>", xmlBuffer.toString());
	}
	
	@Test
	public void appendEscapedElement_Null() {
		
		StringBuilder xmlBuffer = new StringBuilder();
		
		xmlBuffer.append ("<xml>");
		XmlUtils.appendEscapedElement (xmlBuffer, "node", null);
		xmlBuffer.append ("</xml>");
		
		assertEquals ("<xml><node></node></xml>", xmlBuffer.toString());
	}

	
	@Test
	public void appendEscapedNonNullElement_Normal() {
		
		StringBuilder xmlBuffer = new StringBuilder();
		
		xmlBuffer.append ("<xml>");
		XmlUtils.appendEscapedNonEmptyElement (xmlBuffer, "node", "value");
		xmlBuffer.append ("</xml>");
		
		assertEquals ("<xml><node>value</node></xml>", xmlBuffer.toString());
	}
	
	@Test
	public void appendEscapedNonNullElement_NormalEscaped() {
		
		StringBuilder xmlBuffer = new StringBuilder();
		
		xmlBuffer.append ("<xml>");
		XmlUtils.appendEscapedNonEmptyElement (xmlBuffer, "node", "val<ue&>");
		xmlBuffer.append ("</xml>");
		
		assertEquals ("<xml><node>val&lt;ue&amp;&gt;</node></xml>", xmlBuffer.toString());
	}
	
	@Test
	public void appendEscapedNonNullElement_Null() {
		
		StringBuilder xmlBuffer = new StringBuilder();
		
		xmlBuffer.append ("<xml>");
		XmlUtils.appendEscapedNonEmptyElement (xmlBuffer, "node", null);
		xmlBuffer.append ("</xml>");
		
		assertEquals ("<xml></xml>", xmlBuffer.toString());
	}

	
	@Test
	public void appendElement_Normal() {
		
		StringBuilder xmlBuffer = new StringBuilder();
		
		xmlBuffer.append ("<xml>");
		XmlUtils.appendElement (xmlBuffer, "node", "value");
		xmlBuffer.append ("</xml>");
		
		assertEquals ("<xml><node>value</node></xml>", xmlBuffer.toString());
	}
	
	@Test
	public void appendElement_Empty() {
		
		StringBuilder xmlBuffer = new StringBuilder();
		
		xmlBuffer.append ("<xml>");
		XmlUtils.appendElement (xmlBuffer, "node", "");
		xmlBuffer.append ("</xml>");
		
		assertEquals ("<xml><node></node></xml>", xmlBuffer.toString());
	}

	@Test
	public void appendElement_Null() {
		
		StringBuilder xmlBuffer = new StringBuilder();
		
		xmlBuffer.append ("<xml>");
		XmlUtils.appendElement (xmlBuffer, "node", null);
		xmlBuffer.append ("</xml>");
		
		assertEquals ("<xml><node></node></xml>", xmlBuffer.toString());
	}
	
	@Test
	public void appendNonEmptyElement_Normal() {
		
		StringBuilder xmlBuffer = new StringBuilder();
		
		xmlBuffer.append ("<xml>");
		XmlUtils.appendNonEmptyElement (xmlBuffer, "node", "value");
		xmlBuffer.append ("</xml>");
		
		assertEquals ("<xml><node>value</node></xml>", xmlBuffer.toString());
	}
	
	@Test
	public void appendNonEmptyElement_Empty() {
		
		StringBuilder xmlBuffer = new StringBuilder();
		
		xmlBuffer.append ("<xml>");
		XmlUtils.appendNonEmptyElement (xmlBuffer, "node", "");
		xmlBuffer.append ("</xml>");
		
		assertEquals ("<xml></xml>", xmlBuffer.toString());
	}
	
	@Test
	public void appendNonEmptyElement_Null() {
		
		StringBuilder xmlBuffer = new StringBuilder();
		
		xmlBuffer.append ("<xml>");
		XmlUtils.appendNonEmptyElement (xmlBuffer, "node", null);
		xmlBuffer.append ("</xml>");
		
		assertEquals ("<xml></xml>", xmlBuffer.toString());
	}
	
	@Test
	public void escape() {
	
		assertEquals ("&lt;Test&amp;This&gt;", XmlUtils.escape ("<Test&This>"));
	}
}
