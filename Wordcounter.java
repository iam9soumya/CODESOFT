package p1;
import java.util.*;

public class Wordcounter {
	public static void main(String[] ar) {
		System.out.println("Enter a String:");
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String arr[]=a.split(" ");
		int len=arr.length;
		int total_len=a.length();
		System.out.println("No of words are: "+len);
		System.out.println("No of letters with spaces are: "+total_len);
		}
}
