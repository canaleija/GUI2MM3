import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


import escuchadores.EscuchadorBoton;
import gui.FrameCombo;
import gui.FrameFormulario;
import gui.FrameImagen;
import herencia.Alumno;
import herencia.Persona;
import herramientas.GestorImagen;
import herramientas.ModificacionImagenes;
import paralelosockets.Contador;

import java.awt.GridLayout;
import java.awt.Image;


public class App {
    public static void main(String[] args) throws Exception {

        Contador aux = new Contador("c1", 100, 5);
        aux.contar();

        Contador aux2 = new Contador("c2", 50, 7);
        aux2.contar();
     
    }
}
