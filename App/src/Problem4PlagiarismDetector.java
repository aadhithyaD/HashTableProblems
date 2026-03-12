import java.util.*;

public class Problem4PlagiarismDetector {

    HashMap<String,Set<String>> index = new HashMap<>();

    public void addDocument(String id,String text){

        String[] words = text.split(" ");

        for(String word:words){

            index.putIfAbsent(word,new HashSet<>());

            index.get(word).add(id);
        }
    }

    public void showIndex(){
        System.out.println(index);
    }

    public static void main(String[] args){

        Problem4PlagiarismDetector obj = new Problem4PlagiarismDetector();

        obj.addDocument("essay1","this is a sample essay");
        obj.addDocument("essay2","this is another sample text");

        obj.showIndex();
    }
}