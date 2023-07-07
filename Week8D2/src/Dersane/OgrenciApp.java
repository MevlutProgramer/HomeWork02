package Dersane;

public class OgrenciApp {

	public static void main(String[] args) {
		Ogrenci ogr1 = new Ogrenci("Mehmet Aluc", 123);
		Ogrenci ogr2 = new Ogrenci("Mevlut Bozdemir", 124);
		Ogrenci ogr3 = new Ogrenci("Dogukan Ulger", 125);
		Ogrenci ogr4 = new Ogrenci("Muhammer  Talha Yanikoglu", 126);
		System.out.println(Ogrenci.getSayac());
		Ogrenci[] ogrenciler = { ogr1, ogr2, ogr3, ogr4 };

		Derslik lab1 = new Derslik(1, "lab1", ogrenciler);
		System.out.println(Derslik.getSayac());

		Teacher ogt1 = new Teacher("Abuzer Kadayif", "Matematik");
		System.out.println(Teacher.getSayac());

		ogt1.notVer(ogr4, 68);
		System.out.println(ogr4.getNote());
	}

}
