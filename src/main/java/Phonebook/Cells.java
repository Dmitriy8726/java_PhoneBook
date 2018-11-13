package Phonebook;

public class Cells {
	private String NameWhoCells;
	private String NameWorking;
	private int Time;
	
	public Cells (String name, String working, int time)
	{
		this.NameWhoCells = name;
		this.NameWorking = working;
		this.Time = time; 
	}
	public String getNameWhoCells() { return NameWhoCells; }
	public String getNameWorking() { return NameWorking; }
	public int getTime() { return Time; }

}

