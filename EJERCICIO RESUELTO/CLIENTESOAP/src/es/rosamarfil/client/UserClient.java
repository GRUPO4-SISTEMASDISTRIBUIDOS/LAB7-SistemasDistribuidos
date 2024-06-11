package es.rosamarfil.client;

import java.util.Arrays;
import es.rosamarfil.soap.SOAPI;
import es.rosamarfil.soap.SOAPImplService;
import es.rosamarfil.soap.User;

public class UserClient {
    public static void main(String[] args) {
        // Crear una instancia del servicio
        SOAPImplService service = new SOAPImplService();
        
        // Obtener el puerto para interactuar con el servicio
        SOAPI userService = service.getSOAPImplPort();
        
        try {
            // Se muestra la lista de usuarios
            System.out.println("Lista de usuarios: \n" +
            Arrays.toString(userService.getUsers().toArray()));
            
            // Se añade nuevo usuario
            userService.addUser(new User("Pablo", "Ruiz"));
            
            // Se muestra la lista de usuarios
            System.out.println("Lista de usuarios actualizada: \n" +
            Arrays.toString(userService.getUsers().toArray()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

