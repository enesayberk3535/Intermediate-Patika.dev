import java.util.Scanner;

public class factorial {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.println("Faktöriyel girin : ");
        int n = inp.nextInt();
        int total = 1 ;
        for (int i = 1 ; i <= n ; i ++ ){
total = total * i ;

        }
        System.out.println("Toplam : " + total);
    }
}
