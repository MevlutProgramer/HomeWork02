package Dersane;

public class Derslik {
	private int katNo;
	private String labNo;
	private static int sayac;
	private Ogrenci[] ogrenciler;

	public Derslik(int katNo, String lab, Ogrenci[] ogrenciler) {
		this.katNo = katNo;
		this.labNo = lab;
		this.ogrenciler = ogrenciler;

		sayac++;

	}

	public static int getSayac() {
		return sayac;
	}

}
