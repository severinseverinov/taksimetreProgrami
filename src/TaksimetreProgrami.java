import java.util.Scanner;
public class TaksimetreProgrami {
    public static void main(String[] args) {
        int km;
        double perKm=2.20, total=10;

        Scanner input=new Scanner(System.in);

        System.out.print("Mesafeyi giriniz (KM) : ");
        km=input.nextInt();

        total+=(perKm*km);

        total=(total<20) ? 20: total;

        System.out.println("Ödenecek toplam tutar : "+total+"TL dir.");
    }
}
