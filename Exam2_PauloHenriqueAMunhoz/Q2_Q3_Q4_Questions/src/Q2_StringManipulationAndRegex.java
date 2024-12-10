import java.util.*;
import java.util.stream.Collectors;

public class Q2_StringManipulationAndRegex {
	
    public static void main(String[] args) {
    	
    	// The user must insert the paragraph
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a paragraph of text:");

        String input = scanner.nextLine();
        scanner.close();
        
        //Verification to paraphrase is empty
        if (input.isEmpty()) {
        	
            System.out.println("Input is empty.");
            return;
            
        }
        // the array of string called sentences will split the [.!?] if the paragraph have something this.
        String[] sentences = input.split("[.!?]");
        //if to verify if sentences is less than 3 in length.
        if (sentences.length < 3) {
        	
            System.out.println("Input must contain at least three sentences.");
            return;
            
        }
        //method to verify text
        verifyText(input);
    }
    
    //Method to do the verification of the text
    public static void verifyText(String text) {
        int totalCharacters = text.length();
        String[] words = text.split("\\s+");
        int totalWords = words.length;
        int totalSentences = text.split("[.!?]").length;
        double averageWordLength = (double) totalCharacters / totalWords;
        
        // Created a map 
        Map<String, Integer> wordFrequency = new HashMap<>();
        String longestWord = "";
        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
        	
            String cleanWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            
            if (!cleanWord.isEmpty()) {
            	
                wordFrequency.put(cleanWord, wordFrequency.getOrDefault(cleanWord, 0) + 1);
                uniqueWords.add(cleanWord);
                if (cleanWord.length() > longestWord.length()) {
      
                    longestWord = cleanWord;
                    
                }
            }
        }

        List<Map.Entry<String, Integer>> sortedWords = wordFrequency.entrySet()
                .stream()
                .sorted((x, y) -> y.getValue().compareTo(x.getValue()))
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("Total number of characters (including spaces and punctuation): " + totalCharacters);
        System.out.println("Total number of words: " + totalWords);
        System.out.println("Total number of sentences: " + totalSentences);
        System.out.println("Average word length: " + averageWordLength);
        System.out.println("Five most frequent words and their frequencies:");
       
        
        for (Map.Entry<String, Integer> entry : sortedWords) {
        	
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        System.out.println("Longest word in the text: " + longestWord);
        System.out.println("Number of unique words: " + uniqueWords.size());
        
    }
}
