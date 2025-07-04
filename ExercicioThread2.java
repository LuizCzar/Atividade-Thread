
package exerciciothreads;


public class ExercicioThread2 extends Thread{
    public void run(){
        for (char letra = 'a' ; letra <= 'j'; letra++){
           try{ 
               Thread.sleep(1000);
            System.out.println("t2: "+ letra);
             } catch (InterruptedException e){
                 e.printStackTrace();
                 
             }
        }
    }
}
 