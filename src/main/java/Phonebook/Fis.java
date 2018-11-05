package Phonebook;

public class Fis extends  User {
	private String MobTele;
	public Fis (String name, String tele, String mobtele)
	{
		super(name, tele);
		this.MobTele = mobtele;
	}
	public String getMobTele() { return MobTele; }
}

