package Phonebook;


public class User implements CSVfile {
	private String Name, Tele;
	private int ID;
	static int index = 0;
	public User() {}
	public User(String name, String tele)
	{
		this.Name = name;
		this.Tele = tele;
		this.ID = index;
		index++;
	}
	public String getName() { return Name; }
	public String getTele() { return Tele; }
	public String toCSV()
	{
		return (ID + "," + this.Name + "," + this.Tele + ",");
	}
	public void formCSV(String str)
	{
		String[] arr = str.split(","); 
		this.ID = Integer.valueOf(arr[0]);
		this.Name = arr[1];
		this.Tele = arr[2];
    }

}


