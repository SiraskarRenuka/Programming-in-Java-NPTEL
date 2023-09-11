public class Question62 implements Runnable {  
  
    @Override  
    public void run() {  
        System.out.print(Thread.currentThread().getName()+" has ended.");  
    }
// Create main class Question62 with main() method and appropriate statements in it
public static void main(String args[])
{
  Question62 my = new Question62();
  Thread t1 = new Thread(my);
  t1.setName("Main Thread");
  t1.start();
  System.out.println("Welcome to Java Week 6 New Question.");
  t1.setName("MainThread");
}
}
