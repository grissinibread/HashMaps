import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};

        HashTableExercises exercises = new HashTableExercises();
        System.out.println(exercises.mostFrequent(numbers));

        exercises.countPairsWithDiff(numbers, 2);


        System.out.println(Arrays.toString(exercises.twoSum(numbers, 7)));
    }

    public static int hash(String key) {
        int hash = 0;
        for(var ch : key.toCharArray())
            hash += ch;

        return hash % 100;
    }
}