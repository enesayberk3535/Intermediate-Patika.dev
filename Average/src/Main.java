import java.util.Scanner;
public class Main {
    public static void main(String args[]){
    //dersler
        int mat,fizik,kimya,tarih,muzik,türkçe ;
    //Scanner Sınıfı
        Scanner inp = new Scanner(System.in);
    //Kullanıcıdan değerleri alma
        System.out.println("Matematik notunuz :");
        mat =inp.nextInt();
        System.out.println("Fizik notunuz :");
        fizik = inp.nextInt();
        System.out.println("Kimya notunuz :");
        kimya = inp.nextInt();
        System.out.println("Tarih notunuz :");
        tarih = inp.nextInt();
        System.out.println("Muzik notunuz");
        muzik = inp.nextInt();
        System.out.println("Türkçe notunuz");
        türkçe = inp.nextInt();

        int toplam = (mat+fizik+kimya+tarih+muzik+türkçe);
        double sonuc = (toplam/6);
        System.out.println("Not ortalamaniz :"+sonuc);


        }
    }


