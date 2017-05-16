package ua.core.base;

import java.util.List;

public class ExceptionRemote extends ExceptionBaseRuntime {

	private static final long serialVersionUID = -1;

	public ExceptionRemote (Exception e) {
		super (e);
	}

	public ExceptionRemote (Exception e, String message) {
		super (e, message);
	}
	
	public ExceptionRemote (Exception e, List <String> messageList) {
		super (e, messageList);
	}
	
	public ExceptionRemote (String message) {
		super (message);
	}
	
	public ExceptionRemote (List <String> messageList) {
		super (messageList);
	}
}
