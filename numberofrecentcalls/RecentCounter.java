import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> request;
    public RecentCounter() {
        this.request = new LinkedList<>();
    }
    
    public int ping(int t){
        request.add(t);
        while(!request.isEmpty() && request.peek() < t - 3000){
            request.poll();
        }
        return request.size();
    }
}
