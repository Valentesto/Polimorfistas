package EjercitacionClase5.FinCursada;

public class Main {
    
    public static void main(String[] args) {
        conjuntoInvitados invitados = new conjuntoInvitados() {
            @Override
            public void Agregar(String nombre) {
                // Implementation for adding an invitee
            }

            @Override
            public boolean Pertenece(String nombre) {
                // Implementation for checking if an invitee is in the list
                return false;
            }
        };
    }
}
