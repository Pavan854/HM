import java.util.*;
class Evenorodd{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("pleass enter the number");
        int a=sc.nextInt();
        if(a<0){
            System.out.println("Negative value");
        }
        else if (a % 2 == 0){
            System.out.println("it's a even number");
        }else{
            System.out.println("it's a odd number");
        }
        sc.close();

    }
}