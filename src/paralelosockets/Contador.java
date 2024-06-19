package paralelosockets;

public class Contador {


    private int n;
    private int j;
    private String nombre;

    public Contador (String nombre, int n, int j){
        this.nombre = nombre;
        this.n = n;
        this.j = j;
    }

    public void contar (){
        for(int x=0; x<=this.n; x+=j){
            System.out.println(this.nombre+": "+x);
        }
    }

}
