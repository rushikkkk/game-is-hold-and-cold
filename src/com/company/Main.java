import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String value = "";
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        int number = rnd.nextInt(100);
        System.out.println("Вводите числа пока пока не угадаете");
        while (true) {
            value = input.nextLine();
            if (Integer.parseInt(value) < 100 && Integer.parseInt(value) > 0){
                int diff = number - Integer.parseInt(value);
                //System.out.println(diff);
                if (diff == 0){
                    System.out.println("Поздравляем ты угадал число");
                }else if (Math.abs(diff) < 5 ){
                    System.out.println("Горячо");
                }else if (Math.abs(diff) < 10 ){
                    System.out.println("Тепло");
                }else if (Math.abs(diff) < 15){
                    System.out.println("Холодно");
                } else if (Math.abs(diff) < 25){
                    System.out.println("Лед");
                }else {
                    System.out.println("Попробуй еще раз");
                }
                if ("end".equals(value)) {
                    System.out.println("Игра закончена, ты угадал число!");
                    break;
                }
            }else{
                System.out.println("Введите число от 0 до 100");
            }
        }
    }
}

