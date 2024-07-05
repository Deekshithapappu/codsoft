import java.util.Scanner;

class  BankAccount{
    String username;
    String password;
    String accountno;
    float balance=1000f;
    int transactions=0;

    public void register()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter username");
        username=sc.nextLine();
        System.out.println("enter your password");
        password=sc.nextLine();
        System.out.println("enter your account number");
        accountno=sc.nextLine();
        System.out.println("\n Registration successful");
    }
    public boolean login()
    {
        boolean islogin=false;
        Scanner sc=new Scanner(System.in);
        while(!islogin){
            System.out.println("enter UserName");
            String Username=sc.nextLine();
            if(Username.equals(username)){
                System.out.println("enter Password");
                String Password= sc.nextLine();
                if(Password.equals(password))
                {
                    System.out.println("login successfully!");
                    islogin=true;
                }
                else
                {
                    System.out.println("incorrect password");
                    System.out.println("\n");
                }
            }
            else{
                System.out.println("username not found");
                System.out.println("\n");
            }
        }
       return islogin;
    }

    public void withdraw()
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("enter amount");
       float amount=sc.nextFloat();
       try{
       if(balance>=amount)
       {
        transactions++;
        balance=balance-amount;
        System.out.println("withdraw amount= " +amount);
        System.out.println("total balance= " +balance);
       }
       else{
        System.out.println("you dont have sufficient balancce to withdraw ");
       }
    }
    catch(Exception e){
    }
    }
    public void deposit(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter amount");
        float amount=sc.nextFloat();
        try{
        if(amount<=100000f)
        {
         transactions++;
         balance=balance+amount;
         System.out.println("amount deposited = " +amount);
         System.out.println("total balance= " +balance);
        }
        else{
         System.out.println("sorry! limit upto 100000");
        }
     }
     catch(Exception e){
     }     
    }
    public void checkAmount()
    {   
        System.out.println("total balance=" +balance);
    }
    public void transfer()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter receiptent name");
        String receiptent=sc.nextLine();
        System.out.println("enter amount");
        float amount=sc.nextFloat();
        if(balance>=amount)
        {
            transactions++;
            balance=balance-amount;
            System.out.println("transfer amount to "+receiptent );
            System.out.println("total balance= " +balance);
        }
        else
        {
            System.out.println("sorry! insufficent balance to tranfer");
        }
    }
}

public class AtmInterface {
    public static void main(String args[])
    {
        BankAccount ba=new BankAccount();
        Scanner sc=new Scanner(System.in);
        System.out.println("register to the account");
        ba.register();
        System.out.println("login to the account");

        if(ba.login()){
        boolean exit=false;
        while(!exit){
            try{
                System.out.println("1.deposit");
                System.out.println("2.withdraw");
                System.out.println("3.transfer");
                System.out.println("4.check balance");
                System.out.println("5.exit");
        int choice;
        choice=sc.nextInt();
        switch(choice){
            case 1:System.out.println("deposit amount");
                   ba.deposit();
                   break;
            case 2:System.out.println("withdraw amount");
                   ba.withdraw();
                   break;
            case 3:System.out.println("transfer amount");
                   ba.transfer();
                   break;
            case 4:System.out.println("check amount");
                   ba.checkAmount();
                   break;
            case 5: System.exit(choice);;
        }
    }
    catch(Exception e)
    {
        System.out.println("invalid input");
    }
    }
}
sc.close();
    }
    
}
