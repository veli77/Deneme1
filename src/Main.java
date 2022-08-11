import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int mat,fiz,kim,tur,tar,muz;
       Scanner Girdi = new Scanner(System.in);
       System.out.println("Matematik Notunuz? ");
       mat = Girdi.nextInt();
       System.out.println("Fizik Notunuz? ");
       fiz = Girdi.nextInt();
       System.out.println("Kimya Notunuz? ");
       kim = Girdi.nextInt();
       System.out.println("Turkçe Notunuz? ");
       tur = Girdi.nextInt();
       System.out.println("Tarih Notunuz? ");
       tar = Girdi.nextInt();
       System.out.println("Muzik Notunuz? ");
       muz = Girdi.nextInt();
       double sonuc = (mat+fiz+kim+tur+tar+muz)/6.0;
       System.out.println("Ortalamanız = "+sonuc);
       String sinifdurumu = (sonuc > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
       System.out.println(sinifdurumu);
    }
}
