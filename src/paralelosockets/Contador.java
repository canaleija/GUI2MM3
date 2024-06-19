package paralelosockets;

public class Contador implements Runnable{


    private int n;
    private int j;
    private String nombre;

    public Contador (String nombre, int n, int j){
        this.nombre = nombre;
        this.n = n;
        this.j = j;
    }

    public void contar (){
        // crear el hilo 
        Thread hilo = new Thread(this);
        hilo.start();
    }

    @Override
    public void run() {
        for(int x=0; x<=this.n; x+=j){
            System.out.println(this.nombre+": "+x);
        }
    }

}
