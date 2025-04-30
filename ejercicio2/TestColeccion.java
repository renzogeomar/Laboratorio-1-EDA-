package ejercicio2;
import java.util.ArrayList;
import ejercicio1.Persona;
public class TestColeccion {
    public static void main(String[] args) {
        Coleccion arequipa = new Coleccion(8);
        Coleccion lima = new Coleccion(5);
        Coleccion cusco = new Coleccion(10);


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
                regionConMayorIncidencia = "Región " + (i + 1); // Puedes personalizar el nombre de la región
            }
        }
        if (!regionConMayorIncidencia.isEmpty()) {
            System.out.println("La región con mayor incidencia de " + condicion + " es: " + regionConMayorIncidencia + " con " + mayorIncidencia + " casos.");
        } else {
            System.out.println("No se encontraron casos de " + condicion + " en las regiones.");
        }
    }
}