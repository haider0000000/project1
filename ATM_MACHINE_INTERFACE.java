//project1                              //ATM_MACHINE_INTERFACE
import java.util.Scanner;
public class ATM
{
public static void main(String a[])
{
double Balance_Amount=10000;  //intial_amount
int pin=0000;  //intial_pin
Scanner Sc=new Scanner(System.in);
System.out.println("WELCOME TO ATM");
System.out.println("INSERT YOUR CARD");
System.out.println("");
System.out.println("PRESS 1, TO CHANGE YOUR PIN");
System.out.println("PRESS 2,FOR WITHDRAWING AN AMOUNT");
System.out.println("PRESS 3, FOR DEPOSITING IN YOUR BANK ACCOUNT");
System.out.println("PRESS 4,FOR CHECKING YOUR BANK BALANCE");
System.out.println("PRESS 5,TO EXIST");
 
int choice=Sc.nextInt();
switch(choice)
{
case 1:
       System.out.println("enter your current pin");
       int p=Sc.nextInt();
       if(p==pin)
       {
       System.out.println("plese enter your new pin");
       int newpin=Sc.nextInt();
       }
       else
       {
       System.out.println("please enter the correct pin");
       }
       System.out.println("your new pin ="+newpin);
       break;
       
case 2:
      System.out.println("please enter the amount you want to withdraw");
      double withdraw=Sc.nextDouble();
      if(Balance_Amount>= withdraw)
      {
      System.out.println("Amount withdraw by you"+withdraw);
      Balance_Amount=Balance_Amount - withdraw;
      System.out.println("your current BANK BALANCE ="+Balance_Amount);
      }
      else
      {
      System.out.println("you do not have enough money to withdraw");
      }
      break;
case 3:
       System.out.println("please enter the amount you want to deposit");
       double deposit=Sc.nextDouble();
       Balance_Amount=Balance_Amount+deposit;
       System.out.println("your BANK BALANCE after depositing the amount ="+Balance_Amount);
       break;
 case 4:
        System.out.println("your current BANK BALANCE =" +Balance_Amount);
        break;
 case 5:
        System.out.println("Thank you for using our ATM");
        System.exit(0);
        break;
  default:
          System.out.println("please enter the valid Entry ");
}
}
}
