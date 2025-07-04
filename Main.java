
package exerciciothreads;


public class Main {
    public static void main (String [] args){
    System.out.println("Iniciando...");
        Thread t1 = new ExercicioThreads();
        Thread t2 = new ExercicioThread2();
    
            t1.start();
            t2.start();
   System.out.println("Finalizada a contagem.");
            
   
    }
     
}
