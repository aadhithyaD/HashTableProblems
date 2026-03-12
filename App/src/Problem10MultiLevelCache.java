import java.util.*;

public class Problem10MultiLevelCache {

    HashMap<String,String> L1 = new HashMap<>();
    HashMap<String,String> L2 = new HashMap<>();

    public String getVideo(String id){

        if(L1.containsKey(id))
            return "L1 HIT";

        if(L2.containsKey(id)){

            L1.put(id,L2.get(id));

            return "L2 HIT";
        }

        String data = "VideoData";

        L2.put(id,data);

        return "Database HIT";
    }

    public static void main(String[] args){

        Problem10MultiLevelCache obj = new Problem10MultiLevelCache();

        System.out.println(obj.getVideo("video123"));
        System.out.println(obj.getVideo("video123"));
    }
}
