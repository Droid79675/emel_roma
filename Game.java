import java.util.Scanner;
public class Game {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int Player1, Player2, Powerpl1, Powerpl2;
        System.out.println("Введите количество очков здоровья и силу удара соответственно у Player1 и у Player2 ");
        Player1 = scanner.nextInt();
        Player2 = scanner.nextInt();
        Powerpl1 = scanner.nextInt();
        Powerpl2 = scanner.nextInt();
        String command = null;
        while (true) {
            command = scanner.nextLine();
            if (command.equals("Ударить игрока 1")) {
                Player1 -= Powerpl2;
                if (Player1 == 0) {
                    System.out.println("Игрок два победил!");
                } else {
                    System.out.println("Игрок один получил по лицу");
                    System.out.println(Player1);
                }
            }

            if (command.equals("Ударить игрока 2")){

                Player2 -= Powerpl1;
                if (Player2 == 0) {
                    System.out.println("Игрок один победил!");
                } else {
                    System.out.println("Игрок два получил дамаге");
                    System.out.println(Player2);
                }
            }
        }

    }
}


