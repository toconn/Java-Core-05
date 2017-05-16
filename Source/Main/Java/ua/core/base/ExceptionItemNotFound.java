package ua.core.base;

import java.util.List;

public class ExceptionItemNotFound extends ExceptionBase {

	private static final long serialVersionUID = 1;

	public ExceptionItemNotFound() {
		super();
	}

	public ExceptionItemNotFound (String message) {
		super (message);
	}
	
	public ExceptionItemNotFound (String message, Object... messageParamArray) {
		super (message, messageParamArray);
	}
	
	public ExceptionItemNotFound (List <String> messageList) {
		super(messageList);
	}
}
