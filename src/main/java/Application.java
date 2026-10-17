import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String op = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println("Result: ");

        switch (op){
            case "sum" -> System.out.println(a+b);
            case "sub" -> System.out.println(a-b);
            case "div" -> System.out.println(a/b);
            case "mul" -> System.out.println(a*b);
        }
    //a riso é gay

    }
}