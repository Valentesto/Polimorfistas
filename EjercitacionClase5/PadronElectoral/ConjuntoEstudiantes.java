package EjercitacionClase5.PadronElectoral;

public class ConjuntoEstudiantes implements ConjuntoTDA {
    private final int[] elementos;
    private int cantidad;
    private int legajo;

    // constructor para inicializar el conjunto de estudiantes
    public ConjuntoEstudiantes(int legajo) {
        this.legajo = legajo;
        elementos = new int[100]; // Tamaño máximo del conjunto
        cantidad = 0;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public void inicializarConjunto() {
        cantidad = 0;
    }

    @Override
    public void Agregar(int elemento) {
        if (!Pertenece(elemento)) {
            elementos[cantidad] = elemento;
            cantidad++;
        }
    }

    @Override
    public void Sacar(int elemento) {
        for (int i = 0; i < cantidad; i++) {
            if (elementos[i] == elemento) {
                elementos[i] = elementos[cantidad - 1]; // Reemplaza con el último elemento
                cantidad--;
                return;
            }
        }
    }

    @Override
    public boolean Pertenece(int elemento) {
        for (int i = 0; i < cantidad; i++) {
            if (elementos[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean ConjuntoVacio() {
        return cantidad == 0;
    }

    @Override
    public int Elegir() {
        if (cantidad > 0) {
            return elementos[0]; // Devuelve el primer elemento del conjunto
        }
        throw new IllegalStateException("El conjunto está vacío.");
    }
    
}
