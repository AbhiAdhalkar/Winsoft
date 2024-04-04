import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Hello, My name is Abhishek Adhalkar!!";
        
        str = str.toLowerCase();

        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            
            if (Character.isLetter(ch)) {
                
                charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

       
        System.out.println("Duplicate characters in the string:");
        for (char ch : charFrequencyMap.keySet()) {

            if (charFrequencyMap.get(ch) > 1) {

                System.out.println(ch + ": " + charFrequencyMap.get(ch));
            }
        }
    }
}
