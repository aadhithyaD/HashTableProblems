import java.util.*;

class TokenBucket{

    int tokens;

    TokenBucket(int tokens){
        this.tokens = tokens;
    }
}

public class Problem6RateLimiter {

    HashMap<String,TokenBucket> clients = new HashMap<>();

    int limit = 3;

    public boolean checkRateLimit(String client){

        clients.putIfAbsent(client,new TokenBucket(limit));

        TokenBucket bucket = clients.get(client);

        if(bucket.tokens > 0){
            bucket.tokens--;
            return true;
        }

        return false;
    }

    public static void main(String[] args){

        Problem6RateLimiter obj = new Problem6RateLimiter();

        System.out.println(obj.checkRateLimit("client1"));
        System.out.println(obj.checkRateLimit("client1"));
        System.out.println(obj.checkRateLimit("client1"));
        System.out.println(obj.checkRateLimit("client1"));
    }
}
