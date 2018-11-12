package Phonebook;

public class Conf {
	private String[] Name;
	private int Time;
	
	public Conf (String[] name, int time)
	{
		this.Name = name;
		this.Time = time; 
	}
	public String[] getName() { return Name; }
	public int getTime() { return Time; }
}

