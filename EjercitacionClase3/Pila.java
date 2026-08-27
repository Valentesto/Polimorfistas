// Implementacion interna del TDA Pila.
// Los usuarios solo necesitan conocer los metodos de IPila.
public class Pila implements IPila {
    private static final int TAMANIO_MAXIMO = 10;
    private int[] datos;
    private int ultimo;

    @Override
    public void inicializarPila() {
        datos = new int[TAMANIO_MAXIMO];
        ultimo = -1;
    }

    @Override
    public void apilar(int valor) {
        if (ultimo == TAMANIO_MAXIMO - 1) {
            System.out.println("La pila esta llena.");
            return;
        }

        ultimo++;
        datos[ultimo] = valor;
    }

    @Override
    public int desapilar() {
        if (pilaVacia()) {
            System.out.println("No se puede desapilar: la pila esta vacia.");
            return -1;
        }

        int valor = datos[ultimo];
        ultimo--;
        return valor;
    }

    @Override
    public int tope() {
        if (pilaVacia()) {
            System.out.println("La pila esta vacia.");
            return -1;
        }

        return datos[ultimo];
    }

    @Override
    public boolean pilaVacia() {
        return ultimo == -1;
    }
}
