package EjercitacionClase5.PadronElectoral;

public class MainPadronElectoral {
    private static final int MAX_LEGAJO = 1003;

    public static void main(String[] args) {
        ConjuntoTDA votantes = new ConjuntoEstudiantes(MAX_LEGAJO + 1);

        Estudiante ana = new Estudiante("Ana", 1001);
        Estudiante bruno = new Estudiante("Bruno", 1002);
        Estudiante carla = new Estudiante("Carla", 1003);

        registrarVoto(ana, votantes);
        registrarVoto(bruno, votantes);
        registrarVoto(ana, votantes); // Ana intenta votar por segunda vez.

        System.out.println("Carla todavía no votó.");
    }

    private static void registrarVoto(Estudiante alumno, ConjuntoTDA votantes) {
        if (votantes.Pertenece(alumno.getLegajo())) {
            System.out.println("Voto rechazado: " + alumno.getNombre() + " ya había votado.");
            return;
        }

        votantes.Agregar(alumno.getLegajo());
        System.out.println("Voto registrado para " + alumno.getNombre() + ".");
    }

    public static class Estudiante {
        private final String nombre;
        private final int legajo;

        public Estudiante(String nombre, int legajo) {
            this.nombre = nombre;
            this.legajo = legajo;
        }

        public String getNombre() {
            return nombre;
        }

        public int getLegajo() {
            return legajo;
        }
    }

    public interface ConjuntoTDA {
        void Agregar(int legajo);
        boolean Pertenece(int legajo);
    }

    public static class ConjuntoEstudiantes implements ConjuntoTDA {
        private final boolean[] votantes;

        public ConjuntoEstudiantes(int capacidad) {
            this.votantes = new boolean[capacidad];
        }

        @Override
        public void Agregar(int legajo) {
            if (legajo >= 0 && legajo < votantes.length) {
                votantes[legajo] = true;
            }
        }

        @Override
        public boolean Pertenece(int legajo) {
            return legajo >= 0 && legajo < votantes.length && votantes[legajo];
        }
    }
}
