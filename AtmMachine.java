import java.util.Scanner;

class ATM
{
    float Balance;
    int pin = 1234;


    public void checkpin()
    {
        System.out.println("Enter your pin : ");
        Scanner sc = new Scanner(System.in);
        int EnterPin = sc.nextInt();
        
        while(true)
        {
            if(EnterPin != 1234)
            {
                System.out.println("Enter your valid pin : ");
                EnterPin = sc.nextInt();
            }
            else{
                menu();
                break;
            }
        }
    }

    public void menu()
    {
        System.out.println("Enter your choice : ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        }
        else if(opt == 2){
            withdrawmoney();
        }
        else if(opt == 3){
            depositmoney();
        }
        else if(opt == 4){
            return;
        }
        else{
            System.out.println("Choose valid option");
        }
    }

    public void checkBalance()
    {
        System.out.println("Balance : " + Balance);
        menu();
    }

    public void withdrawmoney()
    {
        System.out.println("Enter Amount to Withdraw : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > Balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            Balance = Balance - amount;
            System.out.println("Money Withdrawl Successful");
        }
        menu();
    }

    public void depositmoney()
    {
        System.out.println("Enter the Amount : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount ;
        System.out.println("Money Deposited Successfully");
        menu();
    }

}

public class AtmMachine
{
    public static void main(String[] args)
    {
        ATM obj = new ATM();
        obj.checkpin();
    }
    
}
