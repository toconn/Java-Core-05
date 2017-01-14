package ua.core.base;

import java.util.List;


public class ExceptionInvalidRequest extends ExceptionBase {


	private static final long serialVersionUID = -6216136454678273600L;

	
	public ExceptionInvalidRequest() {

		super();
	}

	public ExceptionInvalidRequest (String message) {

		super (message);
	}
	
	public ExceptionInvalidRequest (String message, Object... messageParamArray) {

		super (message, messageParamArray);
	}
	
	public ExceptionInvalidRequest (List <String> messageList) {

		super(messageList);
	}
}
