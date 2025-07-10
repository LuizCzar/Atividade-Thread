public class Carro extends Thread {
    private String nome;
    private int velocidade;

    public Carro(String nome, int velocidade) {
        this.nome = nome;
        this.velocidade = velocidade;
    }

    public void run() {
        for (int distancia = 10; distancia <= 100; distancia += 10) {
            try {
                Thread.sleep(velocidade);
                System.out.println(nome + " percorreu " + distancia + " metros");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println( nome + " terminou a corrida!");
    }
}
