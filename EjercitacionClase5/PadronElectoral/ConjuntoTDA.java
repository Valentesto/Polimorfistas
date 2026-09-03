package EjercitacionClase5.PadronElectoral;

public interface ConjuntoTDA {
    void inicializarConjunto();
        // Implementación del método para inicializar el conjunto.
    void Agregar(int elemento);
        // Implementación del método para agregar un elemento al conjunto.
    void Sacar(int elemento);
        // Implementación del método para sacar un elemento del conjunto.
    boolean Pertenece(int elemento);
        // Implementación del método para verificar si un elemento pertenece al conjunto.  
    boolean ConjuntoVacio();
        // Implementación del método para verificar si el conjunto está vacío. 
    int Elegir();
        // Implementación del método para elegir un elemento del conjunto.

}