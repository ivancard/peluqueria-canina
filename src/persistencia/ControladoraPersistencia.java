
package persistencia;


import java.util.List;
import logica.Cliente;


public class ControladoraPersistencia {
    ClienteJpaController clienteJPA = new ClienteJpaController();
    
    
    //Se crea el cliente y se valida que el objeto no este vacio.
    public void crearCliente(Cliente cliente) {
        try {
            clienteJPA.create(cliente);            
        } catch (Exception e) {
            System.out.println("No se pudo crear el Cliente");
        }
    }
    
    //Se crea una lista con los numeros de clientes de la BD
    
    public List<Cliente> obtenerHuespedes(){
     return clienteJPA.findClienteEntities();
    }
}
