package ua.core.base;

import java.util.List;

public class ExceptionHandled extends ExceptionBaseRuntime {

	private static final long serialVersionUID = 1;

	public ExceptionHandled() {
		super();
	}

	public ExceptionHandled (String message) {
		super (message);
	}
	
	public ExceptionHandled (String message, Object... messageParamArray) {
		super (message, messageParamArray);
	}
	
	public ExceptionHandled (List <String> messageList) {
		super(messageList);
	}
}
