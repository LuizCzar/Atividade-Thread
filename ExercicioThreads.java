
package exerciciothreads;

public class ExercicioThreads extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++){
           try{
               Thread.sleep(1000);
            System.out.println("t1: " + i);
           }    catch (InterruptedException e) {
               e.printStackTrace();
           }
           
        }
}

    
}
