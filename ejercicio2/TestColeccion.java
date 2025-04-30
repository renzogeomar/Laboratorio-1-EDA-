package ejercicio2;
import java.util.ArrayList;
import ejercicio1.Persona;
public class TestColeccion {
    public static void main(String[] args) {
        Coleccion arequipa = new Coleccion(8);
        Coleccion lima = new Coleccion(5);
        Coleccion cusco = new Coleccion(10);
        // Agregar personas a Arequipa
        arequipa.agregarPersona(new Persona("Juan", 25, 'H', 70.0, 1.75)); // Ideal
        arequipa.agregarPersona(new Persona("Maria", 30, 'M', 50.0, 1.65)); // Desnutricion
        arequipa.agregarPersona(new Persona("Carlos", 40, 'H', 50.0, 1.70)); // Desnutricion
        // Agregar personas a Lima
        lima.agregarPersona(new Persona("Ana", 20, 'M', 80.0, 1.60)); // Sobrepeso
        lima.agregarPersona(new Persona("Luis", 35, 'H', 80.0, 1.80)); // Ideal
        lima.agregarPersona(new Persona("Sofia", 28, 'M', 95.0, 1.70)); // Sobrepeso

        // Agregar personas a Cusco
        cusco.agregarPersona(new Persona("Pedro", 50, 'H', 100.0, 1.75)); // Sobrepeso
        cusco.agregarPersona(new Persona("Lucia", 18, 'M', 55.0, 1.65)); // Ideal
        cusco.agregarPersona(new Persona("Miguel", 22, 'H', 60.0, 1.70)); // Ideal
        
        //Probando el metodo buscarPesona
        Persona personaBuscada = new Persona("Maria", 30, 'M', 50.0, 1.65);
        int indice = arequipa.buscarPersona(personaBuscada);

        if (indice != -1) {
            //System.out.println("La persona " + personaBuscada.getNombre() + " fue encontrada en la posición " + indice + " de la región Arequipa.");
        } else {
            //System.out.println("La persona " + personaBuscada.getNombre() + " no fue encontrada en la región Arequipa.");
        }

        //Probando el metodo eliminarPersona
        Persona personaEliminar = new Persona("Carlos", 40, 'H', 50.0, 1.70);
        arequipa.eliminarPersona(personaEliminar);

        // Crear lista de regiones
        ArrayList<Coleccion> regiones = new ArrayList<>();
        regiones.add(arequipa);
        regiones.add(lima);
        regiones.add(cusco);

        // Determinar región con mayor incidencia de cada condición
        regionAlerta(regiones, "Ideal");
        regionAlerta(regiones, "Desnutricion");
        regionAlerta(regiones, "Sobrepeso");


    }
    public static void regionAlerta(ArrayList<Coleccion> coleccion, String condicion) {
        String regionConMayorIncidencia = "";
        int mayorIncidencia = 0;
        for(int i = 0; i < coleccion.size(); i++) {
            Coleccion c = coleccion.get(i);
            ArrayList<Persona> personas = c.getArrPersona();
            int contador = 0;
            for (int j = 0 ; j < personas.size(); j++){
                Persona p = personas.get(j);
                if (condicion.equalsIgnoreCase("Ideal") && p.calcularIMC() == 0) {
                    contador++;
                } else if (condicion.equalsIgnoreCase("Desnutricion") && p.calcularIMC() == -1) {
                    contador++;
                } else if (condicion.equalsIgnoreCase("Sobrepeso") && p.calcularIMC() == 1) {
                    contador++;
                }
            }
            if (contador > mayorIncidencia) {
                mayorIncidencia = contador;
                regionConMayorIncidencia = "Región " + (i + 1); 
            }
        }
        if (!regionConMayorIncidencia.isEmpty()) {
            System.out.println("La región con mayor incidencia de " + condicion + " es: " + regionConMayorIncidencia + " con " + mayorIncidencia + " casos.");
        } else {
            System.out.println("No se encontraron casos de " + condicion + " en las regiones.");
        }
    }
}