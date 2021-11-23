package day41_Exceptions03;

public class C06_RunnerChackedException {

	public static void main(String[] args) throws C05_InvalidEmailIDcheckedExceptions {

		String email = "rasit@hotmail.com";
		mailDogrula(email);
	}

	public static void mailDogrula(String email) throws C05_InvalidEmailIDcheckedExceptions {
		
		if(email.contains("@gmail.com") || email.contains("@hotmail.com")) {
			System.out.println("mailiniz basarýyla kaydedildi");
		}else {
			throw new C05_InvalidEmailIDcheckedExceptions("email uygun deðil");
		}
	
	}

}
