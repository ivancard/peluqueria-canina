package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //Se crea un objeto Cliente llamando a dicha funcion de la controladora de persistencia.
    public void crearCliente(Cliente cliente) {
        controlPersis.crearCliente(cliente);
    }

    public void crearCliente(
            String numCliente,
            String nombreMascota,
            String razaMascota,
            String colorMascota,
            Boolean esAlergico,
            Boolean atencionEscpecial,
            String nombreDuenio,
            String telefonoDuenio,
            String observaciones) {
        
        controlPersis.crearCliente( new Cliente(numCliente, nombreMascota, razaMascota, colorMascota, esAlergico, atencionEscpecial, nombreDuenio, telefonoDuenio, observaciones));
    }
    
    public List<Cliente> obtenerClientes(){
        return controlPersis.obtenerClientes();
    }
    
    
}
