import java.util.Map;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str = "a green apple";

        CharacterFinder cF = new CharacterFinder();
        System.out.println(cF.findFirstNonRepeatingChar(str));
    }
}