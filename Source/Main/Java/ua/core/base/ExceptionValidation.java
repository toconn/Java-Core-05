package ua.core.base;

import java.util.List;


public class ExceptionValidation extends ExceptionBase {

	private static final long serialVersionUID = -1L;

	public ExceptionValidation() {
		super();
	}

	public ExceptionValidation (String message) {
		super (message);
	}
	
	public ExceptionValidation (String message, Object... messageParamArray) {
		super (message, messageParamArray);
	}
	
	public ExceptionValidation (List <String> messageList) {
		super(messageList);
	}
}
