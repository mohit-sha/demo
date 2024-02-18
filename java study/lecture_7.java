import java.util.Scanner;

public class lecture_7 {

    //first funtion
    public static void printMyName(String name)
    {
        System.out.println(name);
        return;
    }

    //factorail 
    public static void printFacto(int number)
    {
        int factorial=1;
        for(int i=number;i>=1;i--)
        {
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int number=sc.nextInt();
        printMyName(name);
        printFacto(number);
    }
} 