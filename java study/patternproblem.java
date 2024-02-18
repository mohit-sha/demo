public class patternproblem {
    public static void main(String args[])
    {
        int n=4;

        //patter1
        // *****
        // *   *
        // *   *
        // *   *
        // *****
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||j==1||j==n||i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        // patter2
        // &
        // &&
        // &&&
        // &&&&
        // &&&&&
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("&");
            }
            System.out.print("\n");
        }


        //pattern3
        //$$$$$
        //$$$$
        //$$$
        //$$
        //$
        for (int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("$");
            }
            System.out.print("\n");
        }


        //pattern4
        //    #
        //   ##
        //  ###
        // ####
        //#####
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("#");
            }
            System.out.print("\n");
        }


        // pattern5
        //1
        //12
        //123
        //1234
        //12345
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            { 
                System.out.print(j);
            }
            System.out.println();
        }
        

        //pattern6
        //12345
        //1234
        //123
        //12
        //1
        System.out.println();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }


        // pattern7
        // 1 
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        System.out.println();
        int x=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            { 
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }


        // pattern8
        // 1
        // 01
        // 101
        // 0101
        // 10101
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            { 
                if((i+j)%2==1)
                System.out.print("0");
                else System.out.print("1");
            }
            System.out.println();
        }


        // pattern9
        //    %%%%%
        //   %%%%%
        //  %%%%%
        // %%%%%
        //%%%%%
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++)
            {
                System.out.print("%");
            }
            System.out.println();
        }


        //pattern10
        //     1
        //     2 2
        //    3 3 3
        //   4 4 4 4
        //  5 5 5 5 5
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        //pattern11
        //         1 
        //       2 1 2
        //     3 2 1 2 3
        //   4 3 2 1 2 3 4
        // 5 4 3 2 1 2 3 4 5
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            for(int k=2;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }


        //pattern12
        //@        @
        //@@      @@
        //@@@    @@@
        //@@@@  @@@@
        //@@@@@@@@@@
        //@@@@  @@@@
        //@@@    @@@
        //@@      @@
        //@        @
        System.out.println();
        for (int i =1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("@");
            }
            for (int j=1;j<=(n-i)*2;j++)
            {
                System.out.print(" ");
            }
            
            for (int j=1;j<=i;j++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
        for (int i =1;i<=n;i++)
        {
            for (int j=1;j<=(n-i);j++)
            {
                System.out.print("@");
            }
            for (int j=1;j<=i*2;j++)
            {
                System.out.print(" ");
            }
            
            for (int j=1;j<=n-i;j++)
            {
                System.out.print("@");
            }
            System.out.println();
        }


        //pattern13
        //@        @
        //@@      @@
        //@@@    @@@
        //@@@@  @@@@
        //@@@@@@@@@@
        //@@@@@@@@@@
        //@@@@  @@@@
        //@@@    @@@
        //@@      @@
        //@        @
        System.out.println();
        for (int i =1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("@");
            }
            for (int j=1;j<=(n-i)*2;j++)
            {
                System.out.print(" ");
            }
            
            for (int j=1;j<=i;j++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
        for (int i =n;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("@");
            }
            for (int j=1;j<=(n-i)*2;j++)
            {
                System.out.print(" ");
            }
            
            for (int j=1;j<=i;j++)
            {
                System.out.print("@");
            }
            System.out.println();
        }

        //pattern14
        //     #
        //    ###
        //   #####
        //  #######
        //   #######
        //    #####
        //     ###
        //      #
        System.out.println();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("#");
            }
            for (int k=2;k<=i;k++)
            {
                System.out.print("#");
            }
            System.out.print("\n");
        }
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            
            for (int k=1;k<=n-i+1;k++)
            {
                System.out.print("#");
            }
            for (int k=1;k<=n-i;k++)
            {
                System.out.print("#");
            }
            System.out.print("\n");
        }

    }
}
