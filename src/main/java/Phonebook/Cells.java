package Phonebook;

public class Cells {
	private String Name;
	private String Fio;
	private int Time;
	
	public Cells (String name, String fio, int time)
	{
		this.Name = name;
		this.Fio = fio;
		this.Time = time; 
	}
	public String getName() { return Name; }
	public String getFio() { return Fio; }
	public int getTime() { return Time; }
}

