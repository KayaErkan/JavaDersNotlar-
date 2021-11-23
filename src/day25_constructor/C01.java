package day25_constructor;

public class C01 {

	public int ilanNo;
	public String marka;
	public String model="yazilmadi";
	public int yil=1900;

	public int fiyat;

	C01(int ilanNo, String marka, String model, int yil, int fiyat) {
		this.ilanNo = ilanNo;
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.fiyat = fiyat;
	}

	C01 (int ilanNo, String marka,int fiyat) {
		this.ilanNo = ilanNo;
		this.marka = marka;
		this.fiyat = fiyat;
	}
	// eger parammetreli bir constructor oluþturursak java default olaný öldürür
	// bu durumda projemizde aksama olmamasý için default constructor yerine
	// parametresiz bir constructor ý biz oluþturmalýyýz
	
	C01() {

	} // yeni olusturdugumuz parametsiz constructor!!!!

	public void maxHiz(int hiz) {
		System.out.println("Araba " + hiz + " km hiz yapabilir");
	}

	public void yakit(String yakitTuru) {
		System.out.println("araba yakýt olarak " + yakitTuru + " kullanýr");
	}

}
