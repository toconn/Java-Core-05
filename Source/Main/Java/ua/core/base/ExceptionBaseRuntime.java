package ua.core.base;

import java.util.ArrayList;
import java.util.List;

import ua.core.utils.CollectionUtils;
import ua.core.utils.MessageUtils;



public abstract class ExceptionBaseRuntime extends RuntimeException {

	private static final long	serialVersionUID = -3138741202946024745L;

	private List<String> messages = new ArrayList<>();

	
	public ExceptionBaseRuntime() {

		super();
	}
	
	public ExceptionBaseRuntime (Exception e) {
		
		super (e);
		messages.add (e.getMessage());
	}

	public ExceptionBaseRuntime (Exception e, String message) {
		super(e);
		messages.add (message);
	}

	public ExceptionBaseRuntime (Exception e, List<String> messages) {
		
		super(e);

		if (CollectionUtils.isNotEmpty (messages)) {
			messages.add (messages.get (0));
		}
		
		this.messages = messages;
	}

	public ExceptionBaseRuntime (String message) {

		super();
		messages.add (message);
	}

	public ExceptionBaseRuntime (String message, Object... messageParamArray) {

		super();
		addMessage (message, messageParamArray);
	}

	public ExceptionBaseRuntime (List <String> messageList) {

		super();
		this.messages = messageList;
	}

	
	public void addFirstMessage (String message) {

		messages.add (0, message);
	}
	
	public void addFirstMessage (String message, Object... messageParamArray) {
		
		messages.add (0, MessageUtils.toString(message, messageParamArray));
	}

	public void addMessage (String message) {

		messages.add (message);
	}

	public void addMessage (String message, Object... messageParamArray) {
		
		messages.add (MessageUtils.toString(message, messageParamArray));
	}

	public void addMessageList (List <String> messageList) {

		this.messages.addAll (messageList);
	}

	public List <String> getMessageList() {

		return messages;
	}
}
