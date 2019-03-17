package Ejercicio_Productos;
import java.util.Scanner;
public class ProductoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		double precioTotal=0,precio=0, ticketCompra=0,ticketCompra1=0;
		int numero=0,dias=0;
		
		Perecedero []arrayPerecedero= new Perecedero[5];
		arrayPerecedero[0]=new Perecedero ("Carne",18.50, 2);
		arrayPerecedero[1]=new Perecedero ("Pescado",10.50, 1);
		arrayPerecedero[2]=new Perecedero ("Fruta",4.0,3);
		arrayPerecedero[3]=new Perecedero ("Queso",9.50,3);
		arrayPerecedero[4]=new Perecedero ("Marisco",30.50, 5);
		
		
		NoPerecedero [] arrayNoPerecedero = new NoPerecedero[5];
		arrayNoPerecedero[0]=new NoPerecedero ("Cafe",2.50);		
		arrayNoPerecedero[1]=new NoPerecedero ("Azucar",1.50);		
		arrayNoPerecedero[2]=new NoPerecedero ("Sal",1.0);;	
		arrayNoPerecedero[3]=new NoPerecedero ("Aceite",3.50);;		
		arrayNoPerecedero[4]=new NoPerecedero ("Lentejas",1.50);

		
		
		System.out.println("Los productos son: Carne,Pescado,Fruta,Queso,Marisco");
		System.out.println("¿Cuantos productos va a comprar?");
		numero=teclado.nextInt();
		
		for(int i=0;i<5;i++) {		
			precioTotal=arrayPerecedero[i].Calcular(numero);
			System.out.println(arrayPerecedero[i].toString());
			System.out.println("El precio con descuento por caducidad sera de "+ precioTotal);
			ticketCompra = ticketCompra + arrayPerecedero[i].Calcular(numero);	
		}
		System.out.println("El precio de su compra es "+ticketCompra+" Euros");
		System.out.println();
		
		System.out.println("¿Cuantos productos va a comprar?");
		System.out.println("Los productos son: Cafe,Sal,Aceite,Pasta");
		numero=teclado.nextInt();
		
		for(int i=0;i<5;i++) {
			precioTotal=arrayNoPerecedero[i].Calcular(numero);
			System.out.println(arrayNoPerecedero[i].toString()+" PrecioTotal sera de "+ precioTotal);
			ticketCompra1 = ticketCompra1 + arrayNoPerecedero[i].Calcular(numero);
		}
		System.out.println("El precio de su compra es "+ticketCompra1+" Euros");
	}
	

}
