import java.util.*;
public class LargeNumber {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int a;
        int b;

        System.out.println("enter the first number");
        a = sc.nextInt();
        System.out.println("enter the Second number");
        b = sc.nextInt();

        if(a==b){
            System.out.println("Both a and b are equal");
        }

        else if (a<b){
            System.out.println("b is greater than a");
        }
        else{
            System.out.println("a is greater than b");
        }
        sc.close();

    
    }
}
