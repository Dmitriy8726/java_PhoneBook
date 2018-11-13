package Phonebook;
import java.util.*;

public class Statistic <T> {
	ArrayList <T> array = new ArrayList <T>();
	int AllTime()
	{	
		int all = 0;
		for(T var: this.array)
		{
			all += var.getTime();
		}	
		return all;
	}
	
}
