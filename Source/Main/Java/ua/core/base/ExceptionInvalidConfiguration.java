package ua.core.base;

import java.util.List;

public class ExceptionInvalidConfiguration extends ExceptionBase {

	private static final long serialVersionUID = 1;

	public ExceptionInvalidConfiguration() {
		super();
	}

	public ExceptionInvalidConfiguration (String message) {
		super (message);
	}

	public ExceptionInvalidConfiguration (String message, Object... messageParamArray) {
		super (message, messageParamArray);
	}
	
	public ExceptionInvalidConfiguration (List <String> messageList) {
		super(messageList);
	}
}
