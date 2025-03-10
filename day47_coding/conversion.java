import java.util.*;

public class conversion 
{

    // HashMap to store words to number mapping
    static Map<String, Integer> map = new HashMap<>();

    static 
    {
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);
        map.put("eleven", 11);
        map.put("twelve", 12);
        map.put("thirteen", 13);
        map.put("fourteen", 14);
        map.put("fifteen", 15);
        map.put("sixteen", 16);
        map.put("seventeen", 17);
        map.put("eighteen", 18);
        map.put("nineteen", 19);
        map.put("twenty", 20);
        map.put("thirty", 30);
        map.put("forty", 40);
        map.put("fifty", 50);
        map.put("sixty", 60);
        map.put("seventy", 70);
        map.put("eighty", 80);
        map.put("ninety", 90);
        map.put("hundred", 100);
        map.put("thousand", 1000);
        map.put("million", 1000000);
    }

    public static int wordsToNumber(String words) 
    {
        String[] tokens = words.toLowerCase().split(" ");
        int currentNumber = 0;
        int totalNumber = 0;

        for (String token : tokens) {
            if (map.containsKey(token)) {
                int value = map.get(token);
                if (value == 100) {
                    currentNumber *= 100;
                } else if (value >= 1000) {
                    totalNumber += (currentNumber * value);
                    currentNumber = 0;
                } else {
                    currentNumber += value;
                }
            }
        }
        totalNumber += currentNumber;
        return totalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter words to convert to number: ");
        String input = scanner.nextLine();
        int result = wordsToNumber(input);
        System.out.println("Converted Number: " + result);
        scanner.close();
    }
}
