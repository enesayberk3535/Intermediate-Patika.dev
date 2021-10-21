import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        int k ;
        int ortalama = 0;
     Scanner inp = new Scanner(System.in);
        System.out.println("Bir değer giriniz :");
        k = inp.nextInt();
        for(int i = 1 ; i<= k ; i ++ ){
            if(i % 3 == 0  && i % 4 == 0 ){


            }
            ortalama += i ;
            System.out.println("Ortalama : " + ortalama);
        }
    }
}

