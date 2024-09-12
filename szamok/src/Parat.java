import java.util.Scanner;

public class Parat {
    Scanner sc = new Scanner(System.in);
    public void solution() {
        String nmStr = sc.nextLine();
        Double num = Double.parseDouble(nmStr);

        if (num%2 == 0) {
            System.out.print("Páros");
        }
        else {
            System.out.println("Páratlan");
        }
    }
}
