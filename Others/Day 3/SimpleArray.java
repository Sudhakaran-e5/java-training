public class SimpleArray{

	public static void main(String args[]){
		//creating an array to hold integers
		
		//int a[]={1,2,3,4,5};
		int a[]= new int[5] ;
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		int sum = 0;
    
		//adding the elements in the array
		for(int i=0;i<5;i++){    
			sum = sum+a[i];   
		}    
		System.out.println("Sum of the 5 elements is :"+sum);

	}

}