// Contrato: indica que operaciones debe tener una pila.
public interface IPila {
    void inicializarPila();

    void apilar(int valor);

    int desapilar();

    int tope();

    boolean pilaVacia();
}
