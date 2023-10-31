package p1;
import java.util.*;

public class Numbergame{
	public static void numgame(){
		
		int i,j=0;
		Scanner s=new Scanner(System.in);
		
		int num = 1 + (int)(100* Math.random());
		System.out.println("Guess a no between 0 to 100 ");
		
		for(j=0;j<=3;j++){
		System.out.println("Enter a no:");
		i=s.nextInt();
		if(num==i)
		{
			System.out.println("Succeeded!");
		break;
		}
		else if(num<i){
			System.out.println("its much higher Enter again");
			
		}
		else {
			System.out.println("Its lower .");		
	}
		if(j==3){
			System.out.println("It's Over  the number is: "+num);		
}
}
		}
	public static void main(String[] ar){
		numgame();
		}

}