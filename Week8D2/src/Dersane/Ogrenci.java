package Dersane;

public class Ogrenci extends Kisi{
	 
	private int number;
	private static int sayac;
	private int note;

	public Ogrenci(String adSoyad, int number) {
		super(adSoyad); 
		
		this.number = number;

		sayac++;

	}

	public static int getSayac() {
		return sayac;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public int getNote() {
		return note;
	}
}
