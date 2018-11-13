package Phonebook;

public class Conf extends CollsandConf{
	private String[] Name;
	private int Time;
	
	public Conf (String[] name, int time)
	{
		this.Name = name;
		this.Time = time; 
	}
	public String[] getNameConf() { return Name; }
	public String getName() {return null;}
	public int getTime() { return Time; }
}

