package Phonebook;
import java.util.*;
import java.io.*;

public class Book {
    public static void main(String[] args) {
        ArrayList <Fis> bookFis = new  ArrayList <Fis>();
        //ArrayList <Urlic> bookUr = new  ArrayList <Urlic>();
		bookFis.add(new Fis("Dima",   "44444", "88888888888"));
		bookFis.add(new Fis("Grisha", "55555", "88005553535"));
		//System.out.print(bookFis.get(0).getName() + " ");
		//System.out.println(bookFis.get(0).getMobTele());
		//bookUr.add(new Urlic("Oleg", "55555", "85647589"));
		//System.out.print(bookUr.get(0).getName() + " ");
		//System.out.println(bookUr.get(0).getINN());
		//System.out.print(bookFis.get(0).index);
		Statistic <Cells> p = new Statistic <Cells> ();

		try {
            FileWriter fw = new FileWriter("Phonebook.csv");
			for (Fis f : bookFis)
			{
				fw.write(f.toCSV());
			}
			fw.close();
    	}
		catch(IOException error) {
			error.getMessage();
		} 
		
		
		try {
			BufferedReader fw = new BufferedReader(new FileReader("Phonebook.csv"));
			for (Fis f : bookFis)
			{
				f.formCSV(fw.readLine());
			}
			while(fw.readLine() != null)
			{
				Fis temp = new Fis();
				bookFis.add(temp);
				temp.formCSV(fw.readLine());
				
			}
			fw.close();
		}
		catch(IOException error) {
			error.getMessage();
		} 
		
	}
}
