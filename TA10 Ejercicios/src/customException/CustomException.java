package customException;

@SuppressWarnings("serial")
public class CustomException extends Exception{

	public CustomException(String mensaje) {
		super(mensaje);
	}
}
