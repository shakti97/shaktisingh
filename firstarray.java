package javaarraydemo;

public class firstarray {
	public static void main(String []args) {
		/* String fruits[] = {"apple","mango"};
		for (String fruit : fruits ) {
			System.out.println("fruit" + fruit); */
		int arr[]= {22,14,31,211,040,1111,010101010};  //aray of no's
		int sum = 0;                           //intialize sum =0 
		int counter = 0 ;                      //initialize counter =0
		
		for (int i : arr) {                     //starts traversing an array
			sum=0;
			System.out.print(i);                //print element of array
			while (i>0){                        // logic portion starts loops end until the digit of the elememts is greater then zero
				int c = i%10;                   // its stores reminder in c
				sum+=c;                         // it adds the each digit in sum
				i=i/10;                         // it reduces the element 
			}System.out.println(" " + sum);      //it gives the total sum of digits of the elements
			if (sum==4) {                    //it checks the sum is equals to 4 or not
				counter++;                   // it increments the counter by 1
				 
			}
			
		}System.out.println("counter=" + counter);    //it prints the total no. elements whose digits sum is 4
		
	}

}
