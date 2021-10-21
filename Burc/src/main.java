import java.util.Scanner;
public class main {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int month,day ;
        String burç = " ";
        System.out.println("Gün giriniz :");
        day = inp.nextInt();
        System.out.println("Ay Giriniz :");
        month = inp.nextInt();
        boolean isError = false ;
        switch ( month){
            case 1 :
            if(day >= 1 && day <= 31){
            if(day < 22 ){
              burç = "Oğlak";
            } else {
                burç = "Kova";
            }}else {
isError = true ;
                }
            break ;
            case 2 :
                if ( day >= 1 && day <= 28){
                    if ( day <20 ){
                        burç = "Kova";
                    }
                    else {
                        burç = " Balık ";
                    }
                } else {
                    isError = true;
                }
                break ;
            case 3 :
                if(day >= 1 && day <= 31 ){
                    if(day < 21 ){
                        burç = "Balık ";
                    } else {
                        burç = "Koç";
                    }
                } isError = true ;
                break ;
            default :
            }
            if (isError){
                System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz ! ");
            } else {
                System.out.println("Burcunuz : " + burç);
            }
        }
    }

