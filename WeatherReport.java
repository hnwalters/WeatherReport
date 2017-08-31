//Hayden N. Walters
import java.util.Scanner;
	
public class WeatherReport
{
	
	public static void main(String[] args) 
		{		
		System.out.println("Hello, please type to the tempature in degrees Fahrenheit. I will convert it to celsius."); //States the objective
		
		Scanner cin = new Scanner(System.in); //To provide user input
		
		
		double temp = cin.nextInt();
		double c = 5*(temp-32)/9;
		double answer =  c;
		
		
		System.out.println(answer); //displays the outcome
		
		
		 if(temp<=32)
		 {
			 System.out.println("It is freezing."); // if 32 degrees or lower states it is freezing
		 }
	
		  if(temp>=90)
		 {
			 System.out.println("It is hot."); // if 90 degrees or higher says it is hot
		 }
		   if(temp>=212) // if 212 degrees or higher says okay, so yeah you are probably gonna die!
		  {
			  System.out.println("Okay, so yeah you are probably gonna die!");
		  }
		 
		 
	cin.close();
	
	
		}}
	