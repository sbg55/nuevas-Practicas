package practicasSwing;

import javax.swing.*;
import java.awt.*;

public class holaMundoFrame {
    public static void main(String[] args) {
        
        miMarco  marco1 = new miMarco();

        marco1.setVisible(true);

        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class miMarco extends JFrame {
    
    public miMarco (){
       // setBounds(500,300,500, 300);

        setTitle("Opciones de juego");

        Toolkit mipantalla = Toolkit.getDefaultToolkit();

        Dimension tamañoPantalla = mipantalla.getScreenSize();

        int alturaPantalla = tamañoPantalla.height;
        
        int anchoPantalla = tamañoPantalla.width;

        setSize(anchoPantalla/2, alturaPantalla/2);

        setLocation(anchoPantalla/4, alturaPantalla/4);

        Image miIcono = mipantalla.getImage ("anagrama.gif");

        setIconImage(miIcono);




        

    }
}