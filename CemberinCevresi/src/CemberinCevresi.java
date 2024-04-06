
import java.util.Scanner;

public class CemberinCevresi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Çemberin yarıçapını giriniz : ");

        int yaricap = scanner.nextInt();

        System.out.println("Çemberin çevresi : " + (2 * Math.PI * yaricap));
    }

}
