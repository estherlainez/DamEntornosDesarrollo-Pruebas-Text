package EjercicioProductos;

public class Producto {
	String nombre;
    double precio;
	
	public Producto() {
		this.nombre="";
	}
	
	
	public Producto(String n, double pr) {
		this.nombre=n;
		this.precio=pr;
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

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ",\n precio=" + precio + "]";
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double Calcular(int n) {
		double resultado=this.precio *n;
		return resultado;
	}
}
