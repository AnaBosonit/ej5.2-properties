import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {

        /*
        * Java proporciona una herramienta para leer los archivos de propiedades: la clase Properties.
        * Para usarla, 1º inicializar nuestro objeto
        * y 2º indicarle que cargue el fichero de propiedades.*/
        Properties propiedades = new Properties();
        try {
            propiedades.load(new FileReader("src/main/resources/application.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        /*Lo único es usar el método getProperty, pasando como parámetro la clave del valor a extraer, devolviéndolo como un String.*/

        System.out.println("El valor de greeting es: " + propiedades.getProperty("greeting"));
        System.out.println("El valor de my.number es: " + propiedades.getProperty("my.number"));



        /**Intentar leer el valor ‘new.property’, que no existe en application.properties.
         * Al no existir DEVUELVE NULL.
         *
         * Deberá asignar a la variable el texto ‘new.property no tiene valor”.
         Imprime por consola: El valor de new.property es: (valor de ‘new.property’)

         Poner la variable ‘new.property’ dentro del S.O.
         Lanzar aplicación y ver como la presenta.*/

        System.out.println("El valor de new.property es: " + propiedades.getProperty("new.property"));

        System.out.println(propiedades.getProperty("new.property"));

        /*2) Hacer el ejercicio anterior, pero cambiando el fichero application.properties por “application.yml”
         (adaptando el formato) Deberían obtenerse los mismos resultados que anteriormente.
         */


    }


}
