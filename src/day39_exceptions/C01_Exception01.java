package day39_exceptions;

public class C01_Exception01 {
	 /* 
    Exceptions ;
    
    1) 2 tur exceptions vardir :
    
        a) Compile Time (checked) Exceptions : kod creat edilirken Java' nin ongordugu olasi sorunlara
    karsi hatanin altinin cizilmesidir. Ama her alti kirmizi cizilen kod exception degildir.
    
        b) Run Time (unchecked) Exceptions : Kod run edildiginde olusan exceptions' dir.
    
    2) Code creat edilirken Exception kullanilmasi gerekirse;
    
        a) Add throws declaration : Hata olustugunda console' a hata ile ilgili mesaj verir.
        
        b) Try-catch block :  Hata olustugunda hata' nin yazdirilmasi ve handle edilmesini saglar.
        
    3) Try block' tan sonra en az 1 tane catch block olmalidir, aksi durumda CTE verir.
    
    4) Try-catch block' ta try body hatasiz calisirsa catch body calistirilmaz. Catch Body
    Try Body' deki exceptions' da calisir.
        
    5) Try body' den sonra 1' den fazla catch body creat edilebilir. Olusan exceptions hangi catch
    ile ilgiliyse o catch body calisir. Ayni anda sadece tek catch body calisir.
        
*/
}
