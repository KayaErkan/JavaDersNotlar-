package day41_Exceptions03;

public class C05_InvalidEmailIDcheckedExceptions extends Exception {
	
	
	private static final long serialVersionUID = 1L;
	//Java exceptionlar�n tekrars�z olmas�n� saglamak i�in her except�ona unique bir kod verir.
	 

	C05_InvalidEmailIDcheckedExceptions(String message){
		super(message);
		
		
	}
	

}
