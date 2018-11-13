package Phonebook;
import java.util.*;

public class Statistic <T extends CollsandConf> {
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
	
	int getTimeofUser(String name)
	{
		for (T var: this.array)
		{
			if (name == var.getName())
			{
				return var.getTime();
			}
		}
		return 0;
	}
	
	T getMax()
	{
		T temp = array.get(0);
		for(T var: array)
		{
			if (var.getTime() > temp.getTime())
			{
				temp = var;
			}
		}
		return temp;
	}
}
