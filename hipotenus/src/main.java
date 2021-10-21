import java.util.Scanner;
public class main {
    public static void main(String args[]){
    Scanner inp = new Scanner(System.in);
    int a , b ;
    double c ;
        System.out.println("a kenarını giriniz : ");
        a = inp.nextInt();
        System.out.println("b kenarını giriniz : ");
        b = inp.nextInt();
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs :" + c );
    }
}
