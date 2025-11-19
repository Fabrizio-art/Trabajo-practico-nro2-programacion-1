public class Profesor {

    private String nombre;
    private String apellido;

    private ListaEnlazada materiasAsignadas = new ListaEnlazada();

    public Profesor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void asignarMateria(Materia m) {
        materiasAsignadas.agregar(m);
    }

    public ListaEnlazada getMateriasAsignadas() {
        return materiasAsignadas;
    }

    @Override
    public String toString() {
        return "Profesor: " + nombre + " " + apellido;
    }
}