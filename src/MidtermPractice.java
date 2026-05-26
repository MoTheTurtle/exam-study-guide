import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MidtermPractice {

    public static void main(String[] args) {
        // After implementing a method, call it here with
        // some sample input and print the result to
        // check if it works. Fix any issues you find.
        
        ArrayList<String> x = new ArrayList<>();
        x.add("apple");
        x.add("banana");
        x.add("kiwi");

        System.out.println(findLongestWord(x));

        Map<String, Integer> map = new HashMap<>();
        map.put("why",7);
        map.put("hello",8);
        map.put("brilliant" , 99);
        map.put("world",15);
        map.put("amazing", 17);

        System.out.println(countLongWords(map));
        System.out.println(countOddNumbers(map));

        float[] test ={1.5f, 3.5f, 2.0f, 3.0f};
        System.out.println(findAverage(test));


    }

    /**
     * Finds the longest word in an List of Strings.
     * @param list an ArrayList of words
     * @return the longest word in the list
     * Example: input: ["apple", "banana", "kiwi"] -> output: "banana"
     */
    public static String findLongestWord(List<String> list) {
        int length = 0;
        String longestW = ""; 
        for(int i=0;i<list.size();i++){
            String x = list.get(i);
            if(length < x.length()){
                length = x.length();
                longestW = list.get(i);
            } 
    
        }
        return longestW; 
    }
    //I had some syntax error, and writing the arrayList took a good amount of time cause i couldnt figure out why it wasnt working.
    //i just for got i had to import it. 

    /**
     * Counts how many words are longer than 5 characters in the keys of a Map.
     * @param map a Map of strings to integers
     * @return the count of words longer than 5 characters
     * Example: input: ["why"=7, "hello"=8, "brilliant"=99, "world"=15, "amazing"=17] -> output: 2
     */
    public static int countLongWords(Map<String, Integer> map) {
        int count = 0;
        for(String key : map.keySet()){
            if(5 < key.length()){
                count++;
            }
        }
        return count;
    }
    //this one wasnt too bad, but i forgot how to pull the key to get key length. 

    /**
     * Finds the average of the floats in an array.
     * @param arr an array of floats
     * @return the average of the values
     * Example: input: [1.5, 3.5, 2.0, 3.0] -> output: 2.5
     */
    public static double findAverage(float[] arr) {
        int n = arr.length; 
        double total = 0.0;
        for(int i = 0; i < arr.length; i++){
            total= total+ arr[i];
        }
        double average = total/n; 
        return average; 
    }

    /**
     * Counts how many odd numbers there are in the values of a Map.
     * @param map a HashMap of String keys and Integer values
     * @return the count of odd numbers in the values
     * Example: input: {"a"=7, "x"=4, "z"=5} -> output: 2
     */
    public static int countOddNumbers(Map<String, Integer> map) {
        int odd = 0;
        for(String key: map.keySet()){
            int value = map.get(key);
            if(value %2 != 0) {
                odd++;
            }

        }
        return odd;
    }

    /**
     * Returns true if all values are divisible by 3 in an array.
     * @param arr an array of integers
     * @return true if all values are divisible by 3, false otherwise
     * Example: input: [3, 6, 9] -> output: true
     * Example 2: input: [3, 4, 6, 9] -> output: false
     */
    public static boolean allDivisibleBy3(int[] arr) {
        return false;
    }

    /**
     * Returns true if all words start with 'a' in an ArrayList of Strings.
     * @param list an ArrayList of words
     * @return true if all words start with 'a', false otherwise
     * Example: input: ["apple", "apricot", "avocado"] -> output: true
     * Example: input: ["apple", "banana", "avocado"] -> output: false
     */
    public static boolean allStartWithA(List<String> list) {
        return false;
    }

    /**
     * OPTIONAL MORE CHALLENGING PROBLEM
     * NOT REQUIRED
     *
     * Determines if the array can be split into two contiguous subarrays with equal sums.
     * The method checks if there exists an index where the sum of elements to the left of the index
     * is equal to the sum of elements to the right. Both subarrays must be contiguous.
     *
     * @param arr an array of integers to evaluate
     * @return true if there exists a split point where the left and right contiguous subarrays have equal sums, false otherwise
     *
     * Example:
     * Input: [1, 3, 8, 2, 1, 2, 7]
     * Output: true (since [1, 3, 8] and [2, 1, 2, 7] both sum to 12)
     *
     * Input: [1, 2, 3, 4, 5]
     * Output: false (no contiguous split results in equal sums)
     */
    public static boolean canPartitionWithEqualSums(int[] arr) {
        return false;
    }

}