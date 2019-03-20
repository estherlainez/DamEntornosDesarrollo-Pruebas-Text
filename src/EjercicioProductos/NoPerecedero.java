package EjercicioProductos;

public class NoPerecedero extends Producto {
	  private String tipo;
	
	public NoPerecedero() {
		super();
		this.tipo="";
	}
	
	
	public NoPerecedero(String n, double pr) {
		super(n, pr);
	}
	

	@Override
	public String toString() {
		return "NoPerecedero [Tipo: "+tipo+ " Nombre: "+nombre+"]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
