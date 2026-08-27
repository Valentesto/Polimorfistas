package EjerciciosIntegradores;

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

    // metodo IngresarStock(cantidad)
    public void ingresarStock(int cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
            System.out.println("Se han ingresado " + cantidad + " unidades al stock.");
        } else {
            System.out.println("La cantidad a ingresar debe ser mayor que cero.");
        }
    }

    // metodo venderProducto(cantidad)
    public void venderProducto(int cantidad) {
        if (cantidad > 0 && cantidad <= this.cantidad) {
            this.cantidad -= cantidad;
            System.out.println("Se han vendido " + cantidad + " unidades del producto.");
        } else {
            System.out.println("No hay suficiente stock para vender " + cantidad + " unidades.");
        }

    }
    
}