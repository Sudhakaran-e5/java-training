import java.util.Scanner;  
public class CompareProgram {
	public static void main (String[] args) {
		int a, b, c, largest, temp;  
		Scanner sc = new Scanner(System.in);  
		//reading input from the user  
		System.out.println("Enter the first number:");  
		a = sc.nextInt();  
		System.out.println("Enter the second number:");  
		b = sc.nextInt();  
		System.out.println("Enter the third number:");  
		c = sc.nextInt();  
		// temp=a>b?a:b;  // using Ternary Operator
		if(a>b){
			temp = a;
		}else{
			temp = b;
		}
		//comparing the temp variable with c and storing the result in the variable  
		//largest=c>temp?c:temp;  // using Ternary Operator
		if(c>temp){
			largest = c;
		}else{
			largest = temp;
		}

		//prints the largest number  
		System.out.println("The largest number is: "+largest);  
   	}
}
