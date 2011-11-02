/*
 * Proyecto2App.java
 */

package proyecto2;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class Proyecto2App extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
     
        //Llamo la forma de Nombre del Jugador uno!
       
        NombreJugador1 c = new NombreJugador1();
        c.setVisible(true);
        c.pack();
        
       
       
        //Fin de la llamada de la forma :D
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of Proyecto2App
     */
    public static Proyecto2App getApplication() {
        return Application.getInstance(Proyecto2App.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(Proyecto2App.class, args);
    }
}
