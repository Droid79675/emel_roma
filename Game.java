import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Game {
    static Scanner scanner;
    public static void main(String[] args){
        scanner = new Scanner(System.in);
        int Player1,Player2;
        System.out.println("Введите количество очков здоровья соответственно у Player1 и у Player2 ");
        Player1 = scanner.nextInt();
        Player2 = scanner.nextInt();
        String command = null;
        Battle battle = null;
        List<Battle> battles = new ArrayList<Battle>();
        while(true){
            command = scanner.nextLine();
            if (command.equals("Начать сражение")){
                battle = createBattle();
                battles.add(battle);
            }
            else if(command.equals("Найти сражение")){
                Battle battle1 = findCurrentBattle(battles);
                if(battle1 == null){
                    System.out.println("Такого сражения не существует");
                }
            }
                else {
                    System.out.println(battle.getInfo());
                }
                if (command.equals("Ударить игрока 1")){
                Player1 -=5;
                if (Player1 == 0){
                    System.out.println("Игрок два победил!");
                }
                else {
                    System.out.println("Игрок один получил 5 урона");
                    System.out.println(Player1);
                }

            }
            else if (command.equals("Ударить игрока 2"));
            Player2 -=4;
            if (Player2 == 0){
                System.out.println("Игрок один победил!");
            }
            else {
                System.out.println("Игрок два получил 4 урона");
                System.out.println(Player2);
            }
        }
    }
        public static Battle findCurrentBattle(List<Battle> battles) {
            System.out.println("Сражение найдено");
            String string = scanner.nextLine();
            for(Battle battle:battles){
                if(battle.getInfo().equals(string)){
                    return battle;
                }
            }
            return null;
        }
    private static Battle createBattle() {
        System.out.println("Создано новове сражение");
        System.out.println("Опишите параметры сражения");
        String info = scanner.nextLine();
        Battle battle = new Battle (info);
        return battle;
    }

}
