import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NameStorage nameStorage = new NameStorage();

        label:
        while (true) {
            System.out.println("Chose from following: \n a) add name \n b) view the list \n c) exit");
            Scanner scanner = new Scanner(System.in);
            String inputValue = scanner.next();

            switch (inputValue) {
                case "a":
                    System.out.println("type in the name");
                    scanner = new Scanner(System.in);
                    String nameInputValue = scanner.next();
                    nameStorage.addToList(nameInputValue);
                    break;
                case "b":
                    nameStorage.displayArray();
                    break;
                case "c":
                    System.out.println("EXIT");
                    break label;
                default:
                    System.out.println("Error. Try again");
                    break;
            }
        }
    }
}
