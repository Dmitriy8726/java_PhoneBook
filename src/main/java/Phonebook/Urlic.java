package Phonebook;

public class Urlic extends  User {
	private String INN;
	public Urlic (String name, String tele, String inn)
	{
		super(name, tele);
		this.INN = inn;
	}
	public String getINN() { return INN; }
}

