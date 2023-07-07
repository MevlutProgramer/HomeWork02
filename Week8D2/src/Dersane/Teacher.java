package Dersane;

public class Teacher extends Kisi{
	private String adSoyad;
	private String branche;
	private static int sayac;

	public Teacher(String adSoyad, String branche) {
		super(adSoyad);
		this.branche = branche;
		sayac++;

	}

	public static int getSayac() {
		return sayac;
	}

	public void notVer(Ogrenci ogrenci, int note) {
		ogrenci.setNote(note);
	}
}
