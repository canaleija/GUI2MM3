package gui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.GridLayout;
import java.awt.Image;

public class FrameImagen extends javax.swing.JFrame {

    // Etiqueta
    // dentro de la etiqueta Imagen
    private JLabel etiquetaImagen;
    private Image imagen;

    public FrameImagen (Image imagen){
        this.imagen = imagen;
        // inicializar la etiqueta para poder agregarle la imagen
        this.etiquetaImagen =
         new JLabel(new ImageIcon(this.imagen));
        
        setLayout(new GridLayout()); 
        // agregar al frame la etiqueta
        add(this.etiquetaImagen);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        


    }


    
}
