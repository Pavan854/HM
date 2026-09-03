import java.util.*;
public class Prime {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int a=sc.nextInt();
        int count=0;
        for(int i=2;i<a;i++){
            if(a %i==0){
                count +=1;
            }

        }
        if(count == 0){
            System.out.println("givenm number is an prime number");
        }
        else{
            System.out.println("not a prime number");
        }
        sc.close();
        
    }
    
}
