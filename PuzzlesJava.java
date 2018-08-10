import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

public class PuzzlesJava {
    public static void main(String[] args) {
        System.out.println(printSumAndGreaterThan10());
        System.out.println(shuffleNames());
        shuffleAlphabet();
        System.out.println(generateRandomArray());
        sortRandomlyGeneratedArray();
        System.out.println(generateRandomString());
        generateRandomArrayOfStrings();
    }

    public static ArrayList printSumAndGreaterThan10() {
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        int sum = 0;
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(arr[i] > 10) {
                newArr.add(arr[i]);
            }
        }
        System.out.println(sum);
        return newArr;
    }

    public static ArrayList shuffleNames() {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Nancy");
        arr.add("Jinichi");
        arr.add("Fujibayashi");
        arr.add("Momochi");
        arr.add("Ishikawa");
        Collections.shuffle(arr);
        System.out.println(arr);
        ArrayList<String> newArr = new ArrayList<String>();
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i).length() > 5) {
                newArr.add(arr.get(i));
            }
        }
        return newArr;
    }

    public static void shuffleAlphabet() {
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u","v", "w", "x", "y", "z"};
        String[] vowels = {"a", "e", "i", "o", "u"};
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
        Collections.shuffle(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
        for(int i = 0; i < vowels.length; i++) {
            if(list.get(0).contains(vowels[i])) {
                System.out.println("First value in array list is a vowel!");
            }
        }
    }

    public static ArrayList generateRandomArray() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random r = new Random();
        for(int i = 1; i <= 10; i++) {
            int num = r.ints(55, 101).findFirst().getAsInt();
            list.add(num);
        }
        return list;
    }

    public static void sortRandomlyGeneratedArray() {
        ArrayList<Integer> list = new ArrayList<Integer>(generateRandomArray());
        Collections.sort(list);
        System.out.println(list);
        int max = list.get(0);
        int min = list.get(0);
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) > max) {
                max = list.get(i);
            }
            if(list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static String generateRandomString() {
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u","v", "w", "x", "y", "z"};
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
        Collections.shuffle(list);
        String random = "";
        for(int i = 0; i < 5; i++) {
            random += list.get(i);
        }
        return random;
    }

    public static void generateRandomArrayOfStrings() {
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < 10; i++) {
            list.add(generateRandomString());
        }
        System.out.println(list);
    }
}