package ua.core.base;

import java.util.ArrayList;
import java.util.List;

import ua.core.utils.CollectionUtils;
import ua.core.utils.MessageUtils;
import ua.core.utils.StringCollectionUtils;



public abstract class ExceptionBase extends Exception {

	
	private static final long	serialVersionUID = -1;

	private List<String> messages = new ArrayList<>();
	private String separator = " ";
	
	
	public ExceptionBase() {
		super();
	}

	public ExceptionBase (Exception e) {
		super(e);
		messages.add (e.getMessage());
	}

	public ExceptionBase (Exception e, String message) {
		super(e);
		messages.add (message);
	}

	public ExceptionBase (Exception e, List<String> messages) {
		
		super(e);

		if (CollectionUtils.isNotEmpty (messages)) {
			messages.add (messages.get (0));
		}
		
		this.messages = messages;
	}

	public ExceptionBase (String message) {
		super();
		messages.add (message);
	}

	public ExceptionBase (String message, Object... messageParamArray) {
		super();
		addMessage (message, messageParamArray);
	}

	public ExceptionBase (List <String> messageList) {
		super();
		this.messages = messageList;
	}
	
	public void addFirstMessage (String message) {
		messages.add (0, message);
	}
	
	public void addFirstMessage (String message, Object... messageParamArray) {
		messages.add (0, MessageUtils.toString (message, messageParamArray));
	}

	public void addMessage (String message) {
		messages.add (message);
	}

	public void addMessage (String message, Object... messageParamArray) {
		messages.add (MessageUtils.toString (message, messageParamArray));
	}

	public void addMessages (List <String> messageList) {
		this.messages.addAll (messageList);
	}

	public List <String> getMessages() {
		return messages;
	}
	
	public String getMessage() {
		return StringCollectionUtils.join (messages, separator);
	}
	
	public void setMessageSeparator (String separator) {
		this.separator = separator;
	}
}
