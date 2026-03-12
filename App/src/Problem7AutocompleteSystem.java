import java.util.*;

public class Problem7AutocompleteSystem {

    HashMap<String,Integer> queries = new HashMap<>();

    public void addQuery(String query){

        queries.put(query,queries.getOrDefault(query,0)+1);
    }

    public void search(String prefix){

        for(String q:queries.keySet()){

            if(q.startsWith(prefix)){
                System.out.println(q+" ("+queries.get(q)+")");
            }
        }
    }

    public static void main(String[] args){

        Problem7AutocompleteSystem obj = new Problem7AutocompleteSystem();

        obj.addQuery("java tutorial");
        obj.addQuery("javascript guide");
        obj.addQuery("java download");

        obj.search("jav");
    }
}
