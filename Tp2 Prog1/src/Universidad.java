public class Universidad {

    private ListaEnlazada estudiantes = new ListaEnlazada();
    private ListaEnlazada profesores = new ListaEnlazada();

    public void agregarEstudiante(Estudiante e) {
        estudiantes.agregar(e);
    }
    public void agregarProfesor(Profesor p) {
        profesores.agregar(p);
    }

    public void listarEstudiantes() {
        Nodo actual = estudiantes.getPrimero();
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    public void listarProfesores() {
        Nodo actual = profesores.getPrimero();
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    public Estudiante buscarEstudiante(String nombre) {
        Nodo actual = estudiantes.getPrimero();

        while (actual != null) {
            Estudiante e = (Estudiante) actual.dato;
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
            actual = actual.siguiente;
        }

        return null;
    }


    public void ordenarEstudiantesPorNombre() {
      
        Object[] array = estudiantes.convertirAArray();

       
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {

                Estudiante e1 = (Estudiante) array[j];
                Estudiante e2 = (Estudiante) array[j + 1];

                if (e1.getNombre().compareToIgnoreCase(e2.getNombre()) > 0) {
                    Object aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

      
        estudiantes = ListaEnlazada.convertirArrayALista(array);
    }
}