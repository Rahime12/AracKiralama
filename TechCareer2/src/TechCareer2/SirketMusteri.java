package TechCareer2;

public class SirketMusteri extends Musteri {
	String sirketvergiString;
	
	 public SirketMusteri(String adString, String tel, String VergiNo) {
		super(adString, tel);
		this.sirketvergiString=VergiNo;
	}
	public String getSirketvergiString() {
		return sirketvergiString;
	}
	

	
	 
}
