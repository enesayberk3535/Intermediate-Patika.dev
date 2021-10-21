import java.util.Scanner;
public class daire {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int r ;
        System.out.print("Dairenin yarıcapını giriniz : ");
        r = inp.nextInt();
        double pi = 3.14;
        double alan = (pi*r*r);
        double cevre = 2*pi*r ;

        System.out.println("Dairenin alanı : "+ alan);
        System.out.println("Dairenin Çevresi : "+ cevre);
    }
}
