package TechCareer2;
public class SUV extends Arac{

	public SUV(int bagajKapasite, String modelString, String yakitTipiString, double gunlukKiralama, String markaString,
			String segmentString, String vitesTipiString, int yas, String renkString) {
		super(bagajKapasite, modelString, yakitTipiString, gunlukKiralama, markaString, segmentString, vitesTipiString, yas,
				renkString);
		
	}
	
	  public double AylikKiralama() {
		  return getGunlukKiralama() * 30;
	  }

}
