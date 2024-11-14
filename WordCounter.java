import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private final Map<String, Integer> wordMap = new HashMap<>();

    public void addWord(String word){
        //wordMap.merge(word, 1, Integer::sum);
        if (wordMap.containsKey(word) ){
            wordMap.put(word, wordMap.get(word) + 1);
        }
        else{
            wordMap.put(word, 1);
        }
    }

    public void addSentence(String sentence){
        String[] words = sentence.split(" ");
        for (String word : words) {
            addWord(word);
        }
    }

    public void outputResults(){
        //System.out.println(wordMap);
        for (String word : wordMap.keySet()) {
            System.out.println(word + " : " + wordMap.get(word));
        }
    }
}

