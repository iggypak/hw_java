import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Введите число для нахождения пар множителей, произведением которых его можно получить: ");
        int value = new Scanner(System.in).nextInt();

        for (int i = 1; i <= value; i = i + 1){
            for (int j = 1; j <= value; j = j + 1){
                if (i * j == value){
                    System.out.println(i + " * " + j);
                }
            }
        }
    }
}