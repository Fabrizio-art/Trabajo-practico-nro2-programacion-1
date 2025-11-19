public class Estudiante {
    private Integer edad;
    private String nombre;
    private String apellido;
    private String carrera;
    private Float promedio;

    
    private ListaEnlazada materias;

    public Estudiante() {
        this.materias = new ListaEnlazada();
        this.promedio = 0.0f;
    }

   
    public void agregarMateria(Materia materia) {
        this.materias.agregar(materia);
    }

  
    public ListaEnlazada getMaterias() {
        return this.materias;
    }

   
    public Materia[] getMateriasArray() {
        Object[] objs = this.materias.convertirAArray();
        Materia[] arr = new Materia[objs.length];
        for (int i = 0; i < objs.length; i++) {
            arr[i] = (Materia) objs[i];
        }
        return arr;
    }

  
    public float calcularPromedio() {
        return calcularPromedioRecursivo(this.materias.getPrimero(), 0, 0.0f);
    }

   
    private float calcularPromedioRecursivo(Nodo actual, int contador, float suma) {
        if (actual == null) {
            return contador == 0 ? 0.0f : suma / contador;
        }

    Materia mat = (Materia) actual.dato;
    return calcularPromedioRecursivo(actual.siguiente, contador + 1, suma + (float) mat.getNota());
    }

   
    public void actualizarPromedio() {
        this.promedio = calcularPromedio();
    }

    
    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Float getPromedio() {
        return this.promedio;
    }

    public void setPromedio(Float promedio) {
        this.promedio = promedio;
    }
}