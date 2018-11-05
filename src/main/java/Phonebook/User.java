package Phonebook;


public abstract class User {
	private String Name, Tele;
	static int index = 0;
	public User(String name, String tele)
	{
		this.Name = name;
		this.Tele = tele;
		index++;
	}
	public String getName() { return Name; }
	public String getTele() { return Tele; }
}


