package ua.core.base;

public class ExceptionInternal extends ExceptionBase {

	private static final long serialVersionUID = -3257572574360882646L;

	public ExceptionInternal (Exception e) {
		super (e);
	}
	
	public ExceptionInternal (String message, Exception e) {
		super (message, e);
	}
}
