//class Mythread1 extends Thread {
//    public void run() {
//        int i = 0;
//        while (i < 4000) {
//            System.out.println("My cooking Thread is Running");
//            System.out.println("I am happy!");
//            i++;
//        }
//    }
//}
//
//    class Mythread2 extends Thread {
//        public void run()
//
//        {
//            int i = 0;
//            while (i < 4000) {
//                System.out.println("Thread 2 for chatting to hwr");
//                System.out.println("I am sad");
//                i++;
//
//            }
//        }
//    }
//

class Mythreadrunnable1 implements Runnable{
    public void run(){
        int i = 0;
       while (i < 4000){
           System.out.println("I am a runnable 1");
           i++;
       }

    }
}

class Mythreadrunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while (i < 4000){
            System.out.println("I am a runnable 2");
            i++;
        }
    }
}
public class MultiThread {
    public static void main(String[] args) {
//        Mythread1 t1 = new Mythread1();
//        Mythread2 t2 = new Mythread2();
//        t1.start();
//        t2.start();

        Mythreadrunnable1 bullet1 = new Mythreadrunnable1();
        Thread gun1 = new Thread(bullet1);

        Mythreadrunnable2 bullet2 = new Mythreadrunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}

