package EjercitacionClase5.FinCursada;

public class Main {
    
    public static void main(String[] args) {
        conjuntoTDA invitados = new conjuntoInvitados();

        invitado bruno = new invitado("Bruno", "Perez");
        invitado valentina = new invitado("Valentina", "Garcia");
        invitado lucas = new invitado("Lucas", "Rodriguez");

        registrarIngreso(bruno, invitados);
        registrarIngreso(valentina, invitados);
        registrarIngreso(lucas, invitados);

        System.out.println("Cantidad de invitados: " + invitados.getCantidadInvitados());
    }

    public static class invitado {
        private final String nombre;
        private final String apellido;

        public invitado(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }
    }

    public static void registrarIngreso(invitado invitado, conjuntoTDA conjunto) {
        if (!conjunto.Pertenece(invitado.getNombre())) {
            conjunto.Agregar(invitado.getNombre());
            System.out.println("Ingreso registrado para: " + invitado.getNombre() + " " + invitado.getApellido());
        } else {
            System.out.println("El invitado " + invitado.getNombre() + " " + invitado.getApellido() + " ya ha ingresado.");
        }
    }

    public interface conjuntoTDA {
        void inicializarConjunto();
        void Agregar(String nombre);
        boolean Pertenece(String nombre);
        int getCantidadInvitados();
    }

    public static class conjuntoInvitados implements conjuntoTDA {
        private static final int MAX_INVITADOS = 100;
        private int cantidadInvitados;
        private final String[] nombresInvitados;

        public conjuntoInvitados() {
            inicializarConjunto();
            nombresInvitados = new String[MAX_INVITADOS];
        }

        @Override
        public void inicializarConjunto() {
            this.cantidadInvitados = 0;
        }

        @Override
        public void Agregar(String nombre) {
            if (cantidadInvitados < MAX_INVITADOS) {
                nombresInvitados[cantidadInvitados] = nombre;
                cantidadInvitados++;
            } else {
                System.out.println("No se pueden agregar más invitados. Límite alcanzado.");
            }
        }

        @Override
        public boolean Pertenece(String nombre) {
            for (int i = 0; i < cantidadInvitados; i++) {
                if (nombresInvitados[i].equals(nombre)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public int getCantidadInvitados() {
            return cantidadInvitados;
        }
    }
}
