//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int vasyaAge = 49;
        int katyaAge = 34;
        int mishaAge = 36;

        int min = -1;
        int middle = -1;
        int max = -1;


        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge){
            max = vasyaAge;
            if(mishaAge <= katyaAge){
                middle = katyaAge;
                min = mishaAge;
            } else {
                middle = mishaAge;
                min = katyaAge;
            }
        } else if (katyaAge >= mishaAge){
            max = katyaAge;
            if(vasyaAge <= mishaAge){
                middle = mishaAge;
                min = vasyaAge;
            } else {
                middle = vasyaAge;
                min = mishaAge;
            }
        } else {
            max = mishaAge;
            if(vasyaAge <= katyaAge){
                middle = katyaAge;
                min = vasyaAge;
            } else {
                middle = vasyaAge;
                min = katyaAge;
            }
        }

        System.out.println("Minimal age: " + min + "\nMiddle age: " + middle + "\nMiximal age: " + max);

    }
}