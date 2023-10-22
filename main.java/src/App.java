import java.util.Scanner;

public class App {
    public static void main (String[] args) {
        // membuat objek
        Scanner inputUser = new Scanner(System.in);

        System.out.print("nama : ");
        String Nama = inputUser.nextLine();
        System.out.print("nim : ");
        String Nim = inputUser.nextLine();
        System.out.print("nilai Tubes : ");
        float nilaiTubes = inputUser.nextFloat();
        System.out.print("nilai quiz : ");
        float nilaiQuiz = inputUser.nextFloat();
        System.out.print(" nilai tugas : ");
        float nilaiTugas = inputUser.nextFloat();
        System.out.print("nilai UTS : ");
        float nilaiUTS = inputUser.nextFloat();
        System.out.print("nilai UAS : ");
        float nilaiUAS = inputUser.nextFloat();

        float totalNilai = (0.30f * nilaiTubes) + (0.10f * nilaiQuiz) + (0.10f * nilaiTugas) + (0.25f * nilaiUTS) + (0.25f * nilaiUAS);
        
        System.out.println("Total Nilai: " + totalNilai);

        inputUser.close();


    }
}