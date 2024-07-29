package TechCareer2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        List<Arac> araclar = new ArrayList<>();
        List<Musteri> musteriler = new ArrayList<>();

        Arac sedan = new Sedan(25, "Kugo", "Dizel", 200, "Ford", "A", "Otomatik", 12, "Beyaz");
        Arac suv = new SUV(25, "Carolla", "Dizel", 500, "Toyota", "S", "Otomatik", 12, "Kırmızı");
        Arac hatchback = new Hatchback(30, "Focus", "LPG", 800, "Ford", "P", "Manuel", 12, "Siyah");

        araclar.add(sedan);
        araclar.add(hatchback);
        araclar.add(suv);

        Musteri bireyselMusteri = new BireyselMusteri("Ahmet Yılmaz", "1234567890", "11111111111");
        Musteri sirketMusteri = new SirketMusteri("XYZ A.Ş.", "0987654321", "2222222222");

        musteriler.add(sirketMusteri);
        musteriler.add(bireyselMusteri);

        System.out.println("Bireysel musteri icin uygun araclar:");
        for (Arac arac : araclar) {
            if (arac.uygunMu(bireyselMusteri)) {
                System.out.println(arac.getMarkaString() + " " + arac.getModelString());
            }
        }

        System.out.println("\nsirket musterisi icin uygun araclar:");
        for (Arac arac : araclar) {
            if (arac.uygunMu(sirketMusteri)) {
                System.out.println(arac.getMarkaString() + " " + arac.getModelString());
            }
        }
        System.out.print("Bireysel musteri icin kiralamak istediginiz arac modelini giriniz: ");
        String model = scanner.nextLine();

        System.out.print("Kiralamak istediginiz gün sayısını giriniz: ");
        int gun = scanner.nextInt();

        for (Arac arac : araclar) {
            if (arac.getModelString().equalsIgnoreCase(model) && arac.uygunMu(bireyselMusteri)) {
                double toplamBedel = arac.gunlukKiralamaBedeliHesapla(gun);
                System.out.println(model + " model aracin " + gun + " gunluk kiralama bedeli: " + toplamBedel + "₺");
                break;
            }
        }

        System.out.println("\nSirket musterisi icin uygun araclar:");
        for (Arac arac : araclar) {
            if (arac.uygunMu(sirketMusteri)) {
                System.out.println(arac.getMarkaString() + " " + arac.getModelString());
            }
        }

        System.out.print("Sirket musterisi icin kiralamak istediginiz arac modelini giriniz: ");
        scanner.nextLine(); // Dummy read to consume newline
        model = scanner.nextLine();

        System.out.print("Kiralamak istediginiz gün sayısını giriniz: ");
        gun = scanner.nextInt();

        for (Arac arac : araclar) {
            if (arac.getModelString().equalsIgnoreCase(model) && arac.uygunMu(sirketMusteri)) {
                double toplamBedel = arac.gunlukKiralamaBedeliHesapla(gun);
                System.out.println(model + " model aracın " + gun + " gunluk kiralama bedeli: " + toplamBedel + "₺");
                break;
            }
        }

        scanner.close();
    }
}