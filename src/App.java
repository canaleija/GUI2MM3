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

import java.awt.GridLayout;
import java.awt.Image;


public class App {
    public static void main(String[] args) throws Exception {
     
    //  Combo Box  =  "JComboBox"  Constructores(4) (api oracle) | Object,Component, Container, J
    //  estado del combo cambie (selección de lo elementos que tiene) 
    // obtener la imagen
    
    // abrir la imagen por medio del gestor
    GestorImagen aux = new GestorImagen();
    // asignamos a variable la imagen abierta
    Image imagen = aux.abrirImagen();
    // creamos un frame especial para mostrar la imagen    
    FrameImagen fi = new FrameImagen(imagen);

    }
}
