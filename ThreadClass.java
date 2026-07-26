

// ===================================================Runnable Interface=======================================
// public class ThreadClass implements Runnable{
//     public  void run(){
//         System.out.println("this is my overidden method");
//     }
//     public static void main(String[]args){ 
//         ThreadClass th=new ThreadClass();
//         Thread thread=new Thread(th);
//         System.out.println("This is before starting a thread");
//         thread.start(); //it internally calls the run method
//         System.out.println("Thread is created ---");
//     }
// }

// class main implements Runnable{
//     public  void run(){
//         System.out.println("this is my overidden main run function");
//     }
// }


// public class ThreadClass implements Runnable{
//     public  void run(){
//         System.out.println("this is my overidden method");
//     }
//     public static void main(String[]args){ 
//         ThreadClass th=new ThreadClass();
//         Main m=new Main();
//         Thread thread2=new Thread(m);
//         Thread thread=new Thread(th);
//         System.out.println("This is before starting a thread");
//         thread.start(); //it internally calls the run method
//         thread2.start();
//         System.out.println("Thread is created ---");
//     }
// }
// public class ThreadClass {
//     // public  void run(){
//     //     System.out.println("this is my overidden method");
//     // }
//     public static void main(String[]args){ 
//         // ThreadClass th=new ThreadClass();
//         main m=new main();
//         Thread thread=new Thread(m);
//         System.out.println("This is before starting a thread");
//         thread.start(); //it internally calls the run method
//         System.out.println("Thread is created ---");
//     }
// }








// ========================================Extending thread class================================

class MultiThreading extends Thread {
    @Override
    public void run(){
        System.out.println("Multithread learning");
    }
}
class ThreadClass{
    public static void main(String[]args){
        MultiThreading m=new MultiThreading();
        m.start();
    }
}