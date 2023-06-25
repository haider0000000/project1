//project1                              //ATM_MACHINE_INTERFACE
import java.util.Scanner;

public class ATM {
    int w=0;
    int d=0;
    Scanner Sc=new Scanner(System.in);
    double Balance_Amount=10000; //intial_amount
    double withdraw;
    double deposit;
    int choice;

    void transaction()
    {
        
    
        if (w==0&&d==0)
        {
            System.out.println("no transaction occured by your account");
        }
       
        else if(d>0)
        {
            for(int i=0;i<=d; i++)
            { 
            System.out.println("the Amount deposit by you"+deposit);
            }

        }
        else if(w>0)
        {   for(int i=0;i<=w; i++)
            { 
            System.out.println("the Amount withdraw by you"+withdraw);
            }
        }

        return ;



    }
    void Withdraw()
    {    
      System.out.println("please enter the amount you want to withdraw");
       withdraw=Sc.nextDouble();
      if(Balance_Amount>= withdraw)
      {
      System.out.println("Amount withdraw by you"+withdraw);
      Balance_Amount=Balance_Amount - withdraw;
      System.out.println("your current BANK BALANCE ="+Balance_Amount);
      w++;
      
      }
      else
      {
      System.out.println("you do not have enough money to withdraw");
      }
      return;
    }
    void Deposit()
    {    
      System.out.println("please enter the amount you want to deposit");
       deposit = Sc.nextDouble();
       Balance_Amount=Balance_Amount+deposit;
       System.out.println("your BANK BALANCE after depositing the amount ="+Balance_Amount);
       d++;
       return;
     }
    void transfer()
    {   System.out.println("please enter the  reciever's Account number");
        double account_number=Sc.nextInt();
        System.out.println("please enter the amount you want to transfer");
        double transfer_amount=Sc.nextDouble();
        if(Balance_Amount>= transfer_amount)
      {
      System.out.println("Amount transfer by you"+transfer_amount);
      Balance_Amount=Balance_Amount - transfer_amount;
      System.out.println("your current BANK BALANCE ="+Balance_Amount);
      }
      else
      {
      System.out.println("you do not have enough money to transfer");
      }
     return;
    }
    void quit()
    {
      System.out.println("Thank you for using our ATM");
        System.exit(0);
    }
    public static void main(String[] args) {
        int correct_pin=0000;  //intial_pin
        Scanner Sc= new Scanner(System.in);
        ATM aa=new ATM();
        System.out.println("WELCOME TO ATM");
        System.out.println("INSERT YOUR CARD");
        System.out.println("PLEASE ENTER YOUR PIN ");
        int pin=Sc.nextInt();
        if (correct_pin==pin)
      {
        System.out.println("PRESS 1, TRANSACTION");
        System.out.println("PRESS 2, WITHDRAWING ");   
        System.out.println("PRESS 3, DEPOSIT");
        System.out.println("PRESS 4, TRANSFER ");
        System.out.println("PRESS 5,TO QUIT");

        int choice=Sc.nextInt();
        switch(choice)
        {
         case 1:
                aa.transaction();
                break;

         case 2:
                aa.Withdraw();
                break;
         case 3:
             aa.Deposit();
              break;
         case 4:
             aa.transfer();
              break;
         case 5:
             aa.quit();
             break;
         default:
             System.out.println("please enter the valid Entry ");
        }
        System.out.println("Do you want to continue(0,1)?"+choice);
      }
      else{
        System.out.println(" Incorrect pin");
        System.out.println(" Thank you");
      }
      
    }
  } 
