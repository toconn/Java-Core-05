package ua.core.base;

import java.util.List;

public class ExceptionInvalidValue extends ExceptionBase {

	private static final long serialVersionUID = 6322170300529366221L;

	public ExceptionInvalidValue() {
		super();
	}

	public ExceptionInvalidValue (String message) {
		super (message);
	}

	public ExceptionInvalidValue (String message, Object... messageParamArray) {
		super (message, messageParamArray);
	}
	
	public ExceptionInvalidValue (List <String> messageList) {
		super(messageList);
	}
}
