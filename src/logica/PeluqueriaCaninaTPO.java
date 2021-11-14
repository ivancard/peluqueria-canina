package logica;

import igu.Pantalla;



public class PeluqueriaCaninaTPO {
    
    public static void main(String[] args) {
        
        //Instancia de controladora.
        Controladora control = new Controladora();
        
        //Inicializa igu
        Pantalla screen = new Pantalla(control);
        screen.setVisible(true);
        screen.setLocationRelativeTo(null);
        
    }
    
}
