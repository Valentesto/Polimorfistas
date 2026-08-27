// Parte de alto nivel: usa solamente el contrato IPila.
public class Main {
    public static void main(String[] args) {
        IPila miPila = new Pila();
        miPila.inicializarPila();

        miPila.apilar(10);
        miPila.apilar(20);
        miPila.apilar(30);

        System.out.println("El tope de la pila es: " + miPila.tope());
        System.out.println("Se desapilo: " + miPila.desapilar());
        System.out.println("El nuevo tope es: " + miPila.tope());
        System.out.println("¿La pila esta vacia? " + miPila.pilaVacia());
    }
}
