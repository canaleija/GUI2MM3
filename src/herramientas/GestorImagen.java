package herramientas;

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.image.BufferedImage;

// va orientada a poder obtener una imagen de la pc
public class GestorImagen {


    public Image abrirImagen(){

            // definir los filtros para lectura
            FileNameExtensionFilter filtro =
                    new FileNameExtensionFilter("Imagenes","jpg","jpeg","png","bmp");
            // crear un selector de archivos
            JFileChooser selector = new JFileChooser();
            // agregar el filtro al selector
            selector.addChoosableFileFilter(filtro);
            // especificar que solo se puedan abrir archivos
            selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
            
            //ejecutar el selector de imagenes
            int res = selector.showOpenDialog(null);

            if (res == 1 ){
                
                return null;
                
            }
            
            File archivo = selector.getSelectedFile();
            
            BufferedImage bi = null;
            try {
                bi = ImageIO.read(archivo);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            return toImage(bi);

       
    }

    public  Image toImage (BufferedImage bi){
        return bi.getScaledInstance(bi.getWidth(),bi.getHeight(), BufferedImage.TYPE_INT_RGB);
    }

    public static BufferedImage toBufferedImage (Image imagen){

        BufferedImage bi = 
                new BufferedImage(imagen.getWidth(null), imagen.getHeight(null), BufferedImage.TYPE_INT_RGB);
        
        Graphics2D nueva = bi.createGraphics();
        nueva.drawImage(imagen, 0, 0,null);
        nueva.dispose();
        
        return bi;
    }
    
}
