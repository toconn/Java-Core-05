package ua.core.base;

import java.util.List;

public class ExceptionRuntime extends ExceptionBaseRuntime {

	private static final long serialVersionUID = -8941077157542797278L;

	public ExceptionRuntime (Exception e) {
		super (e);
	}
	
	public ExceptionRuntime (Exception e, String message) {
		super (message, e);
	}
	
	public ExceptionRuntime (Exception e, List <String> messageList) {
		super (e, messageList);
	}
}
