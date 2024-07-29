package TechCareer2;

import java.util.List;

public class Arac {
 
 private int bagajKapasite;
 private String modelString;
 private String yakitTipiString;
 private double gunlukKiralama;
 private String markaString;
 private String segmentString;
 private String vitesTipiString;
 private int yas;
 private String renkString;
public String marka;


public Arac(int bagajKapasite, String modelString, String yakitTipiString, double gunlukKiralama, String markaString,
        String segmentString, String vitesTipiString, int yas, String renkString) {
this.bagajKapasite = bagajKapasite;
this.modelString = modelString;
this.yakitTipiString = yakitTipiString;
this.gunlukKiralama = gunlukKiralama;
this.markaString = markaString;
this.segmentString = segmentString;
this.vitesTipiString = vitesTipiString;
this.yas = yas;
this.renkString = renkString;
}
public boolean uygunMu(Musteri musteri) {
    if (musteri instanceof BireyselMusteri) {
        return this instanceof Sedan || this instanceof Hatchback;
    } else if (musteri instanceof SirketMusteri) {
        return true;
    }
    return false;

}
public double getGunlukKiralama1() {
    return gunlukKiralama;
}

public double gunlukKiralamaBedeliHesapla(int gun) {
    return gunlukKiralama * gun;
}

public double getAylikKiralamaBedeli() {
	return 0;
}



public int getBagajKapasite() {
	return bagajKapasite;
}
public void setBagajKapasite(int bagajKapasite) {
	this.bagajKapasite = bagajKapasite;
}
public String getModelString() {
	return modelString;
}
public void setModelString(String modelString) {
	this.modelString = modelString;
}
public String getYakitTipiString() {
	return yakitTipiString;
}
public void setYakitTipiString(String yakitTipiString) {
	this.yakitTipiString = yakitTipiString;
}
public String getMarkaString() {
	return markaString;
}
public void setMarkaString(String markaString) {
	this.markaString = markaString;
}
public String getSegmentString() {
	return segmentString;
}
public void setSegmentString(String segmentString) {
	this.segmentString = segmentString;
}
public String getVitesTipiString() {
	return vitesTipiString;
}
public void setVitesTipiString(String vitesTipiString) {
	this.vitesTipiString = vitesTipiString;
}
public int getYas() {
	return yas;
}
public void setYas(int yas) {
	this.yas = yas;
}
public String getRenkString() {
	return renkString;
}
public void setRenkString(String renkString) {
	this.renkString = renkString;
}
public String getMarka() {
	return marka;
}
public void setMarka(String marka) {
	this.marka = marka;
}
public void setGunlukKiralama(double gunlukKiralama) {
	this.gunlukKiralama = gunlukKiralama;
}
public double getGunlukKiralama() {
    return gunlukKiralama;




 


}}
