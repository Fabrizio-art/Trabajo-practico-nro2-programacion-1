public class ListaEnlazada {
private Nodo primero;

public ListaEnlazada() {
    this.primero = null;
}

public Nodo getPrimero() {
    return primero;
}


public void agregar(Object dato) {
    Nodo nuevo = new Nodo(dato);
    if (primero == null) {
        primero = nuevo;
    } else {
        Nodo actual = primero;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }
}


public void mostrar() {
    Nodo actual = primero;
    while (actual != null) {
        System.out.println(actual.dato);
        actual = actual.siguiente;
    }
}


public Object[] convertirAArray() {
    int tamaño = 0;
    Nodo actual = primero;

    while (actual != null) {
        tamaño++;
        actual = actual.siguiente;
    }

    Object[] array = new Object[tamaño];
    actual = primero;
    int i = 0;

    while (actual != null) {
        array[i] = actual.dato;
        actual = actual.siguiente;
        i++;
    }

    return array;
}


public static ListaEnlazada convertirArrayALista(Object[] array) {
    ListaEnlazada nueva = new ListaEnlazada();
    for (int i = 0; i < array.length; i++) {
        nueva.agregar(array[i]);
    }
    return nueva;
}

}