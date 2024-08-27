import java.util.Scanner;

        public class IT24102674Lab5Q1 {

           public static void main(String[]args)
 
             {
              
                //Create an object called input to scanner class
                  Scanner input = new Scanner(System.in);

                //Declare variables
                  int number;
                  int N1 = 36;
                  int N2 = 14;
                  int N3 = 85;

                //Take user inputs
                  System.out.print("Enter the first integer : ");
                  number = input.nextInt();

                  System.out.print("Enter the second integer : ");
                  number = input.nextInt();

                  System.out.print("Enter the third integer : ");
                  number = input.nextInt();

                  System.out.print("User entered numbers are : ");
                  number = input.nextInt();
                  

                //Check whether which integer is smallest and largest
                  if(N1 > N2 && N3 > N1) {
                    System.out.print("the smallest number is :" + N2 \n"the largest number is :" + N3 );
                    
                    }
                 
                  
           }
  }
 