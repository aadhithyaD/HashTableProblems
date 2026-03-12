import java.util.*;

public class Problem2FlashSaleInventory {

    HashMap<String,Integer> stock = new HashMap<>();
    Queue<Integer> waitingList = new LinkedList<>();

    public void addProduct(String product,int count){
        stock.put(product,count);
    }

    public synchronized void purchaseItem(String product,int userId){

        int current = stock.getOrDefault(product,0);

        if(current > 0){
            stock.put(product,current-1);
            System.out.println("Success. Remaining: "+(current-1));
        }
        else{
            waitingList.add(userId);
            System.out.println("Added to waiting list. Position: "+waitingList.size());
        }
    }

    public static void main(String[] args){

        Problem2FlashSaleInventory obj = new Problem2FlashSaleInventory();

        obj.addProduct("IPHONE15",5);

        obj.purchaseItem("IPHONE15",101);
        obj.purchaseItem("IPHONE15",102);
    }
}