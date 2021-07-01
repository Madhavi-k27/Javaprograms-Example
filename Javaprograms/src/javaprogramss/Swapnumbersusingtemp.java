package javaprogramss;

public class Swapnumbersusingtemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//with third variable		
		/*int mysalary=30;
		int superiorsalary=50;
		System.out.println("Before swapping:mine-"+ mysalary + " superiorsalary: " +superiorsalary);
		int temp=mysalary;
		mysalary=superiorsalary;
		superiorsalary=temp;
		System.out.println("After swapping:mine-"+mysalary+ " superiorsalary: " +superiorsalary);
		*/
	
	//without using third variable
		
		/*int a=20;
		int b=10;
		*/
		int first=30;
		int second=10;
		
		//System.out.println("Before swapping:a "+ a + " b:" +b);
		System.out.println("Before swapping:first "+ first + " second:" +second);
		/*a=a-b;
		b=a+b;
		a=b-a;*/
		first=first*second;
		second=first/second;
		first=first/second;
				
		/*first=first-second;
		second=first+second;
		first=second-first;
		*/
		/*a=a*b;
		b=a/b;
		a=a/b;
		*/
		//System.out.println("After swapping:a "+ a + " b:" +b);
		System.out.println("After swapping:first "+ first + " second:" +second);
		
		}

}