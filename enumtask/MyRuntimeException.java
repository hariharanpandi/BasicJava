package enumtask;

public class MyRuntimeException extends Exception {
	private final String msg;
	@Override
	public String getMessage() {
		return msg;
	}
	public MyRuntimeException(String string) {
		this.msg=string;
	}

}
