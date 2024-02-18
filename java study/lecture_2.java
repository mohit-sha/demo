import java.util.Scanner;

class lecture_2{
    public static void main(String args[]){
        //output
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
           
        //input
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();//for line
        //nextInt() for int value
        //nextFloat() for float value
        System.out.println(name);

        //variables
        //1 - int
        int a = 10;
        int b = 25;
        int sum =a+b;
        System.out.println(sum);
        int mul=a*b;
        System.out.println(mul);




        //q. take 2 variable a and b and print their sum
         int c=sc.nextInt();
         int d = sc.nextInt();
         int sum_q=c+d;
         System.out.println(sum_q);
    }
}