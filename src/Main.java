//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int minutes = 0;
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int currentVolume = 0;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        while (currentVolume <= volume) {
            minutes = minutes + 1;
            currentVolume = currentVolume + fillingSpeed - devastationSpeed;
        }
        System.out.println("Бассейн наполнился за " + minutes + " (мин)");
    }
}