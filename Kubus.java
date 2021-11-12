import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class Kubus {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, kelas;
        double s, luasKubus, volKubus, keliling, luas;

        System.out.println("-------------------------------------------------");
        System.out.print("Masukkan Nama\t\t: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM\t\t: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas\t\t: ");
        kelas = sc.nextLine();
        System.out.println("-------------------------------------------------");
        System.out.print("Masukkan sisi persegi\t\t: ");
        s = sc.nextInt();

        keliling = 4 * s;
        luas = s * s;
        luasKubus = 6 * s * s;
        volKubus = s * s * s;

        System.out.println("");
        System.out.println("=================================================");
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("NIM\t\t\t: " + nim);
        System.out.println("Kelas\t\t\t: " + kelas);
        System.out.println("=================================================");
        System.out.println(String.format("Keliling persegi adalah %.2f", keliling));
        System.out.println(String.format("Luas persegi adalah %.2f", luas));
        System.out.println(String.format("Luas permukaan kubus adalah %.2f", luasKubus));
        System.out.println(String.format("volume kubus adalah %.2f", volKubus));
        System.out.println("=================================================");
    }
}