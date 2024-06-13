package herramientas;


import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class ModificacionImagenes {


public Image modificarColor (Image imagenOriginal){

    GestorImagen aux = new GestorImagen();

    // obtener el buffer para poder crear una imagen nueva
    BufferedImage bi = aux.toBufferedImage(imagenOriginal);
    Color verde = new Color(38,255,0);
    Color color;
    // posicionarnos en cada uno de los pixeles de imagen
    for(int x=0; x<bi.getWidth();x++ ){
        for(int y=0; y < bi.getHeight();y++){
            int rgb = bi.getRGB(x,y);
            color = new Color(rgb);
            int r = color.getRed();
            int g = color.getGreen();
            int b = color.getBlue();
            // evaluar los tonos
            if ((g>=196 & g<=226)&&(b>=60 & b<=90)){
                // modificamos el color del pixel
                bi.setRGB(x, y, verde.getRGB());
            }
        }
    }
    

    return aux.toImage(bi);
}


public Image generarImagenEnGrises(Image imagenOriginal){

    
}


}
