package ejercicio2;
import java.util.ArrayList;
import ejercicio1.Persona;
public class Coleccion {
    private ArrayList<Persona> arrPersona;
    private int contador;
    public Coleccion() {
        arrPersona = new ArrayList<Persona>();
        contador = 10;
    }
    public Coleccion(int contador) {
        arrPersona = new ArrayList<Persona>();
        this.contador = contador;
    }
    public void agregarPersona(Persona persona){
        if(arrPersona.size() < contador) {
            arrPersona.add(persona);
        } else {
            System.out.println("No se pueden agregar más personas a la colección.");
        }
    }
    public int buscarPersona(Persona persona){
        for (int i=0 ; i<arrPersona.size(); i++){
            Persona p= arrPersona.get(i);
            if (p.getNombre().equals(person.getNombre()) && p.getEdad() == persona.getEdad() && p.getSexo() == persona.getSexo()){
                System.out.println("La persona " + persona.getNombre() + " se encuentra en la posición " + i + " de la colección.");
                return i;
            }
            else{
                return -1;
            }
        }
    }
    public void eliminarPersona(Persona persona) {
        int index = buscarPersona(persona);
        if (index != -1) {
            int ultimo = arrPersona.size() - 1;
            if (index != ultimo) {
                // Intercambiar la persona en la posición index con la última persona
                arrPersona.set(index, arrPersona.get(ultimo));
            }
            // Eliminar la última persona (que ahora está duplicada)
            arrPersona.remove(ultimo);
            System.out.println("La persona " + persona.getNombre() + " ha sido eliminada de la colección.");
        } else {
            System.out.println("La persona " + persona.getNombre() + " no se encuentra en la colección.");
        }
    }
    public ArrayList<Persona> mayoresEdad() {
        ArrayList<Persona> mayores = new ArrayList<>();
        for (int i=0 ; i<arrPersona.size(); i++){
            Persona p= arrPersona.get(i);
            if (p.esMayorDeEdad()){
                System.out.println("La persona " + p.getNombre() + " es mayor de edad.");
                mayores.add(p);
            }
            else{
                System.out.println("La persona " + p.getNombre() + " no es mayor de edad.");
            }
        }
        return mayores;
    }
    




    
}