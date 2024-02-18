import java.util.Scanner;

public class lecture_4 {
    public static void main( String args[]){
        Scanner sc= new Scanner(System.in);
        //loops
        //for loop
        //example - 1
        for(int counter=0;counter<3;counter++){
        System.out.println("this is 'for' loop");
        }
        //example - 2
        //print 0-10
        for (int counter=0;counter<11;counter++){
            System.out.println(counter+" using 'for' loop");
        }

        //enhanced for loop
        //example
        int[] numbers={1,2,3,4,5,6,7,8,8,9};
        for (int item:numbers)
        {
            System.out.println("enchaced for "+item);
        }
        
        //example - 3
        //wap to print sum of n natural number
        int n=sc.nextInt();
        int sum=0;
        for (int k=1;k<=n;k++)
        {
            sum=sum+k;    
        }
        System.out.println("Sum of N natural number using for "+sum);

        //while loop
        //example - 1
        int i=0;
        while(i<11){
            System.out.println(i+" using 'while' loop");
            i++; 
        }
         
        //example - 2
        //wap to print sum of n natural number
        int o=sc.nextInt();
        sum=0;
        int k=1;
        while (k<=o) {
            sum=sum+k;
            k++;
        }
        System.out.println("Sum of N natural number using while "+sum);
        //do-while loop
        //example
        int j=0;
        do{
            System.out.println(j+" using 'do-while' loop");
            j++;
        }while(j<11);
    }
    
}