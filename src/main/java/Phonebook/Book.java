package Phonebook;
import java.util.*;

public class Book {
    public static void main(String[] args) {
        ArrayList <Fis> bookFis = new  ArrayList <Fis>();
        ArrayList <Urlic> bookUr = new  ArrayList <Urlic>();
		bookFis.add(new Fis("Dima", "44444", "88888888"));
		System.out.print(bookFis.get(0).getName() + " ");
		System.out.println(bookFis.get(0).getMobTele());
		bookUr.add(new Urlic("Oleg", "55555", "85647589"));
		System.out.print(bookUr.get(0).getName() + " ");
		System.out.println(bookUr.get(0).getINN());
		System.out.print(bookFis.get(0).index);
    }
}
