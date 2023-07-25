import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------------");
        System.out.println("Saat 8 ve havladı uyanmalımıyım ? "+uyanmalimiyim(true,1));
        System.out.println("Saat 2 ve HAVLAMADI uyanmalımıyım ?  "+uyanmalimiyim(false,2));
        System.out.println("Saat 8 ve havladı uyanmalımıyım ? "+uyanmalimiyim(true,8));
        System.out.println("Saat -1 ve havladı uyanmalımıyım ? "+uyanmalimiyim(true,-1));
        System.out.println("Soru1 "+hasTeen(9, 99, 19));
        System.out.println("Soru2 "+hasTeen(23, 15, 42));
        System.out.println("Soru3 "+hasTeen(22, 23, 34));
        System.out.println("------------------------------------");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("------------------------------------");
        Scanner scanner= new Scanner(System.in);
        try {
            System.out.println("1. Değeri giriniz");
            double area1 = scanner.nextDouble(); // Get the first value from the user
            System.out.println("2. Değeri giriniz");
            double area2 = scanner.nextDouble();

            System.out.println("Area = " + area(area1, area2));

        } catch (Exception ex) {
            System.out.println("Geçersiz giriş yaptınız.");
        }

        try{
            System.out.println("Radius degerini giriniz ");
            double rad =scanner.nextDouble();
            System.out.println(area(rad));
        }catch (Exception ex)
        {
            System.out.println("Hatalı veri girişi");
        }

    }




    public static boolean uyanmalimiyim(boolean havladiMi , int saat) {
        if(saat<0 || saat>23) return false;
        if (!havladiMi) return false;
        return saat <8 || saat>=20;
    }
    public  static boolean hasTeen(int deger1 , int deger2 ,int deger3){
        if ((13<deger1 && deger1<=19) || (13<deger2 && deger2<=19)  || (13<deger3 && deger3<=19)  ) return true;
        return false;
    }
    public static boolean isCatPlaying (boolean mevsim , int sicaklik){
       if (mevsim) return (25<=sicaklik && sicaklik<=45);
       else return (25<=sicaklik && sicaklik<=35);
    }

    public static double area(double area1, double area2) {
        if (area1 < 0 || area2 < 0) {
            System.out.println("Alan değerleri 0'dan küçük olamaz");
            return -1;
        }
        return area1 * area2;
    }

    public  static  double area(double radius){
        if (radius < 0) {
            System.out.println("Alan değerleri 0'dan küçük olamaz");
            return -1;
        }
        return radius*radius*Math.PI;
    }

}



