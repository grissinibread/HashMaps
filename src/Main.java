import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Mosh");
//        System.out.println(hash("123456-A"));

        String str = "orange";
        System.out.println(str.hashCode());
    }

    public static int hash(String key) {
        int hash = 0;
        for(var ch : key.toCharArray())
            hash += ch;

        return hash % 100;
    }
}