import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        int a;
        Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Выберите действие: \n" +
                        "1. Добавить задачу " +
                        "\n2. Вывести список задач " +
                        "\n3. Удалить задачу " +
                        "\n0. Вывод");

            a = Integer.parseInt(scanner.nextLine());
            switch (a) {
                case 1:
                    System.out.println("Добавить задачу");
                    list.add(scanner.nextLine());
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Вывести список задач:");
                    System.out.println(String.join("\n",list));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Удалить задачу");
                    int indexInput = Integer.parseInt(scanner.nextLine());
                    list.remove(indexInput);
                    break;
                case 0:
                    break;
                default:
                    String inputFinish = String.valueOf(a);
                    if (inputFinish.equals("Finish")) {
                        System.out.println("Завершения задачи");
                    }
                        break;
            }
        } //while
    }
}