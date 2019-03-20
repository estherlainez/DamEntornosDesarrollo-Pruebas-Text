package EjercicioProductos;

public class Perecedero extends Producto {
	 private int dias_aCaducar;
	
	public Perecedero() {
		super();
	}
	
	public Perecedero(String n, double pr, int d) {
		super(n, pr);
		this.dias_aCaducar=d;
	}

	public int getDias_aCaducar() {
		return dias_aCaducar;
	}

	public void setDias_aCaducar(int dias_aCaducar) {
		this.dias_aCaducar = dias_aCaducar;
	}

	@Override
	public String toString() {
		return "Perecedero [Nombre: "+nombre+ ", dias_aCaducar=" + dias_aCaducar + "]";
	}
	
	public double Calcular(int cantidad) {
		double reducion=0,resultado=0;
		double precioFinal=cantidad*this.precio;
		
		if(dias_aCaducar==1) {
			precioFinal=(precioFinal/4);
		} else if(dias_aCaducar==2) {
				precioFinal=(precioFinal/3);
			} else if(dias_aCaducar==3) {
				precioFinal=(precioFinal/2);
				}
		
		
		return precioFinal;
	}

}
