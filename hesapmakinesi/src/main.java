import java.util.Scanner;
public class main {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n1,n2,islem ;
        System.out.println("İlk sayıyı giriniz : ");
        n1 = inp.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        n2 = inp.nextInt();

        System.out.println("Bir sayı seçiniz 1-Toplama \n 2-Çarpma \n 3-Bölme \n 4- Çıkarma ");
        System.out.println("Seçiminiz : ");
        islem = inp.nextInt();

        switch (islem){
            case 1  :
                System.out.println("Toplam : " + (n1 + n2 ));
                break ;
            case 2 :
                System.out.println("Çarpma : "+ (n1 *  n2 ));
                break ;
            case 3 :
                System.out.println("Bölme : " + (n1/n2));
                break ;
            case 4  :
                System.out.println("Çıkarma : "+ (n1-n2));
                break ;
            default:
                System.out.println("Hatalı islem yaptınız .");
        }
    }

}
