public class Question65 extends Thread{  
  public void run(){  
      
  }  
 public static void main(String args[]){  
    Question65 t1=new Question65();  
    System.out.println("Name of thread 't1':"+ t1.getName());  

Question65 t2=new Question65();  
    System.out.println("Name of thread 't2':"+ t2.getName());
// Write the necessary code below...
//start thread 1
t1.start();
//set the name of thread1
t1.setName("Week 6 Assignment Q5");

//start thread 2
t2.start();
//set the name of thread1
t2.setName("Week 6 Assignment Q5 New");
System.out.println("New name of thread 't1':"+ t1.getName()); 
   System.out.println("New name of thread 't2':"+ t2.getName());
 
 }  
}