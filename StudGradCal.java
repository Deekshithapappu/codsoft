import java.util.Scanner;

public class StudGradCal{
    
    public static void main(String[] args) {
        read();
    }
     public static void read()
     {
        Scanner sc=new Scanner(System.in);
        int english,hindi,telugu,science,social,computers;
        System.out.println("enter english marks:");
        english=sc.nextInt();
        System.out.println("enter telugu marks:");
        telugu=sc.nextInt();
        System.out.println("enter hindi marks:");
        hindi=sc.nextInt();
        System.out.println("enter science marks:");
        science=sc.nextInt();
        System.out.println("enter social marks:");
        social=sc.nextInt();
        System.out.println("enter computers marks:");
        computers=sc.nextInt();
        int Totalmarks=english+telugu+hindi+science+social+computers;
        float average=(Totalmarks)/6;
        System.out.println("total marks of a student=" +Totalmarks);
        System.out.println("average percentage per student=" +average);
        if(Totalmarks>=90)
        {
            System.out.println("grade = A");
        }
        else if(Totalmarks<90 && Totalmarks>=80)
        {
            System.out.println("grade = B");
        }
      else if(Totalmarks<80 && Totalmarks>=70)
        {
            System.out.println("grade = C");
        }  
        else if(Totalmarks<70 && Totalmarks>=35)
        {
            System.out.println("passed!");
        }  
        else
        {
            System.out.println("failed!");
        }
     }

}