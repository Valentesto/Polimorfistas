public class producto {
    private final int codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    public producto(int codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void mostras_dato() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
    }

    public void consultar_stock() {
        System.out.println("Stock disponible: " + cantidad);
    }

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
    }
}