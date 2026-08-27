package EjerciciosIntegradores;

public class Main {
    public static void main(String[] args) {
        // Crear primer producto
        producto producto1 = new producto(1, "Laptop", 999.99, 5);
        System.out.println("--- Producto 1 ---");
        producto1.mostras_dato();
        producto1.consultar_stock();

        // Crear segundo producto
        producto producto2 = new producto(2, "Mouse", 25.50, 20);
        System.out.println("\n--- Producto 2 ---");
        producto2.mostras_dato();
        producto2.consultar_stock();

        // ingresar stock a un producto varias veces
        System.out.println("\n--- Ingresar Stock al Producto 1 ---");
        producto1.ingresarStock(10);
        producto1.consultar_stock();
        producto1.ingresarStock(5);
        producto1.consultar_stock();

        // vender producto 
        System.out.println("\n--- Vender Producto 2 ---");
        producto2.venderProducto(5);
        producto2.consultar_stock();
        producto2.venderProducto(20); // Intento de vender más de lo disponible
        producto2.consultar_stock();
    }
}
