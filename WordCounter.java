import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String text = "Hello, My name is Abhishek, This is a sample string. Count the number of words in this string.";

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        
        String[] words = text.split("\\s+");

        for (String word : words) {
            
            word = word.replaceAll("[^a-zA-Z]", "");
            
            word = word.toLowerCase();

            if (!word.isEmpty()) {
                
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        
        System.out.println("Word counts:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }

        int totalWords = wordCountMap.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total number of words: " + totalWords);
    }
}
