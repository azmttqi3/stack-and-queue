public class Main {
    public static void main(String[] args) {
        //buat objek RecentCounter
        RecentCounter recentCounter = new RecentCounter();

        //lakukan panggilan ping dan cetak hasilnya
        System.out.println("Ping(1): " + recentCounter.ping(1));
        System.out.println("Ping(100): " + recentCounter.ping(100));
        System.out.println("Ping(3001): " + recentCounter.ping(3001));
        System.out.println("Ping(3002): " + recentCounter.ping(3002));
        System.out.println("Ping(6000): " + recentCounter.ping(6000));        
    }
}
