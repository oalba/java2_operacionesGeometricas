import java.util.Scanner;

import com.zubiri.geometria.*;


public class OperacionesGeometricas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String opcion=" ";
		
		System.out.println("Elige una figura geometrica:\na) Circulo\nb) Rectangulo");
		
		opcion=sc.next();
		
		
		if ((opcion.equalsIgnoreCase("a"))||(opcion.equalsIgnoreCase("b"))){
			if (opcion.equalsIgnoreCase("a")){
				double radio, result;
				OperacionesCirculo operaciones = new OperacionesCirculo();
		
				Scanner sc1 = new Scanner(System.in);
				System.out.print("\nIntroduce el radio de un circulo: ");
				radio = sc1.nextInt();
				operaciones.setRadio(radio);
		
				result = operaciones.area();
				System.out.println("\nEl area del circulo es: " + result);
				result = operaciones.circunferencia();
				System.out.println("\nLa circunferencia del circulo es: " + result);
				/*double radio=0;
				Circulo c1=new Circulo();
				System.out.println("Circulo");
				System.out.println("Introduce el radio:");
				radio=tecla1.nextDouble();
				c1.setRadio(radio);
				System.out.println("Area: "+c1.calculaArea());
				System.out.println("Perimetro: "+c1.calculaPerimetro());*/
			}
			if (opcion.equalsIgnoreCase("b")){
				double base, altura, result;
				OperacionesRectangulo operaciones = new OperacionesRectangulo();
		
				Scanner sc1 = new Scanner(System.in);
				System.out.print("\nIntroduce la altura de un rectangulo: ");
				altura = sc1.nextInt();
				operaciones.setAltura(altura);

				System.out.print("\nIntroduce la base de un rectangulo: ");
				base = sc1.nextInt();
				operaciones.setBase(base);
		
				result = operaciones.area();
				System.out.println("\nEl area del rectangulo es: " + result);
				result = operaciones.perimetro();
				System.out.println("\nEl perimetro del rectangulo es: " + result);
				/*double base=0; double altura=0;
				Rectangulo r1=new Rectangulo();
				System.out.println("Rectangulo");
				System.out.println("Introduce la base:");
				base=tecla1.nextDouble();
				r1.setBase(base);
				System.out.println("Introduce la altura:");
				altura=tecla1.nextDouble();
				r1.setAltura(altura);
				System.out.println("Area: "+r1.calculaArea());
				System.out.println("Perimetro: "+r1.calculaPerimetro());*/
			}

		}else{
			System.out.println("Opcion no valida");
		}
		
		

	}

}
