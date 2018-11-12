package Phonebook;

public class Fis  extends  User{
	private String MobTele;
	public Fis() {}
	public Fis (String name, String tele, String mobtele)
	{
		super(name, tele);
		this.MobTele = mobtele;
	}
	public String getMobTele() { return MobTele; }
	public String toCSV()
	{
		return (super.toCSV() + this.MobTele + "\n");
	}
	public void formCSV(String str)
	{
		super.formCSV(str);
		this.MobTele = str.substring(str.lastIndexOf(","));
    }
}

