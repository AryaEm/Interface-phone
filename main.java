package interface2;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        phone redmiNote8 = new Xiaomi();

        PhoneUser dian = new PhoneUser(redmiNote8);

        dian.turnOnThePhone();
        
        Scanner input = new Scanner(System.in);
        String aksi; 

        while (true) {
            System.out.println("\n=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------\n");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                dian.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                dian.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                dian.increaseVolume();
            } else if (aksi.equalsIgnoreCase("4")){
                dian.decreaseVolume();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }

    }

}