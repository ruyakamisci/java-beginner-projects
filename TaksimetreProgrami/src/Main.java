import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total , startPrice = 10; // km başına 2.20 tl, başlngcücrt 10 tl

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz : "); // kullanıcıdan mesafeyi alırız
        km = input.nextInt();

        total = (km * perKm);
        total += startPrice;  // toplamı başücret ile toplayıp totale atıyor

        total = (total < 20) ? 20 : total; // total<20 durumunda yine de 20 tl alınır. indi-bindi gibi
        System.out.println("Toplam Tutar : " + total);
    }
}