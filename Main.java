import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        System.out.println(countX(n));
    }

    private static int countX(String string) {
        if (string.length() < 2){
            return 0;
        }
        if (string.substring(0, 2).equals("hi")) {
            return 1 + countX(string.substring(2));
        } else {
            return countX(string.substring(1));
        }
    }
}