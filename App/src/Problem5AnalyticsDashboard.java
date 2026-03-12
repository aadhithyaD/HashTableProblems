import java.util.*;

public class Problem5AnalyticsDashboard {

    HashMap<String,Integer> pageViews = new HashMap<>();
    HashMap<String,Set<String>> visitors = new HashMap<>();
    HashMap<String,Integer> sources = new HashMap<>();

    public void processEvent(String url,String user,String source){

        pageViews.put(url,pageViews.getOrDefault(url,0)+1);

        visitors.putIfAbsent(url,new HashSet<>());
        visitors.get(url).add(user);

        sources.put(source,sources.getOrDefault(source,0)+1);
    }

    public void dashboard(){

        System.out.println("Page Views: "+pageViews);
        System.out.println("Unique Visitors: "+visitors);
        System.out.println("Sources: "+sources);
    }

    public static void main(String[] args){

        Problem5AnalyticsDashboard obj = new Problem5AnalyticsDashboard();

        obj.processEvent("/news","user1","google");
        obj.processEvent("/news","user2","facebook");

        obj.dashboard();
    }
}