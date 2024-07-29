package TechCareer2;

public class Sedan extends Arac {

	public Sedan(int bagajKapasite, String modelString, String yakitTipiString, double gunlukKiralama,
			String markaString, String segmentString, String vitesTipiString, int string, String renkString) {
		super(bagajKapasite, modelString, yakitTipiString, gunlukKiralama, markaString, segmentString, vitesTipiString, string,
				renkString);
	}

	public double AylikKiralama() {
		return getGunlukKiralama() * 30 * 0.93;
	}

}
