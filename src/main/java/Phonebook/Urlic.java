package Phonebook;

public class Urlic extends  User {
	private String INN;
	public Urlic() {}
	public Urlic (String name, String tele, String inn)
	{
		super(name, tele);
		this.INN = inn;
	}
	public String getINN() { return INN; }
	public String toCSV()
	{
		return (super.toCSV() + this.INN + "\n");
	}
	public void formCSV(String str)
	{
		super.formCSV(str);
		this.INN = str.substring(str.lastIndexOf(","));
    }
}

