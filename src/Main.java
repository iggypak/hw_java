import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Введите число от 1 до 12 для расчета факториала: ");
        int value = new Scanner(System.in).nextInt();
        int factorial = 1;
        boolean isValid = value >= 1 && value <= 12;
        String message = "Введено некорректное число для расчета!";

        if (isValid){
            for (int i = 1; i < value; i++){
                factorial *= i;
            }
            message = "Факториал числа" + value + " равен: " + factorial;
        }
        System.out.printf(message);
    }
}