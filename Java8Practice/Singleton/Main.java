package Singleton;

public class Main extends Thread{

    static void userLogger(){
        Logger user1 = Logger.getLogger();
        System.out.println("Created user logger");
    }
    static void adminLogger(){
        Logger admin = Logger.getLogger();
        System.out.println("Created admin logger");
    }
    public static void main(String[] args) {

        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(10);
                    userLogger();
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                adminLogger();
            }
        };
        t1.start();
        t2.start();
    }
}
