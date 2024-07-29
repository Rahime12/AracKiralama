package TechCareer2;

public class BireyselMusteri extends Musteri{
	
	private String Tc;	
	
public BireyselMusteri(String adString, String telString ,String tc) {
		super(adString, telString);
		this.Tc=tc;
	}



public String getTc() {
	return Tc;
}



}
