import java.util.Scanner;

public class IT24102266Lab5Q3
{
 public static void main(String args[])
 { 
   double Start_day , End_day , Tot_day , discount=0;
   double per_day = 48000;
   
   Scanner input = new Scanner(System.in);
  
   System.out.print("Enter the Start Day (1 - 31):");
   Start_day = input.nextInt();
   
   if(Start_day>=1 && Start_day<=31 )
   {
      System.out.print("Enter the End Day (1- 31) :");
      End_day = input.nextInt();
      
      if(End_day <=31 && End_day>=1)
      { 
        Tot_day = End_day - Start_day;
        System.out.println("Room Charge Per Day : " + per_day);
        System.out.println("Number of Days Reserved :" + Tot_day);        
        
        if(Tot_day<3)
          discount =per_day * Tot_day *0;
                  
        if(Tot_day>=3 || Tot_day<=4)
          discount = per_day * Tot_day * 10/100;
 
         if(Tot_day>=5)
          discount = per_day * Tot_day * 20/100;
          
        
          double T_amount =  per_day * Tot_day - discount;

          System.out.println("Total Amount to be paid :" + T_amount);
 
      
      }
      else
         System.out.println("Invalied End Date :");
    }
    else 
         System.out.println("Invalied Start Date :");

    }
}
