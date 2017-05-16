package ua.core.base;

import java.util.List;

public class ExceptionInternal extends ExceptionBase {

	private static final long serialVersionUID = 1;

	public ExceptionInternal (Exception e) {
		super (e);
	}
	
	public ExceptionInternal (Exception e, String message) {
		super (e, message);
	}
	
	public ExceptionInternal (Exception e, List <String> messageList) {
		super(e, messageList);
	}

}
