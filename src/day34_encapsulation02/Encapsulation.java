package day34_encapsulation02;

public class Encapsulation {

	private String okulIsmi = "Yildiz Koleji";
	private int okulHesapNo = 12345;
	private boolean okulAcikMi = true;
	
	public String getOkulIsmi() {
		return okulIsmi;
	}
	public int getokulHesapNo() {
		return okulHesapNo;
	}
	public boolean isokulAcikMi() {
		return okulAcikMi;
	}
	public void setOkulIsmi(String okulIsmi) {
		this.okulIsmi = okulIsmi;
	}
	public void  setokulHesapNo(int okulHesapNo) {
		this.okulHesapNo = okulHesapNo;
	}
	
	public void  setokulAcikMi(boolean okulAcikMi) {
		this.okulAcikMi = okulAcikMi;
	}
	
}
