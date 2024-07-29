package TechCareer2;
public class Hatchback extends Arac{

	public Hatchback(int bagajKapasite, String modelString, String yakitTipiString, double gunlukKiralama, String markaString,
			String segmentString, String vitesTipiString, int yas, String renkString) {
		super(bagajKapasite, modelString, yakitTipiString, gunlukKiralama, markaString, segmentString, vitesTipiString, yas,
				renkString);
		// TODO Auto-generated constructor stub
	}
	
	  public double AylikKiralama() {
		  return getGunlukKiralama() * 30 * 0.95;
	  }

}
