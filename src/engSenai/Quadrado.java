package engSenai;

public class Quadrado {


	private double lado;
	
	public void setLado(double lado) {
		this.lado = lado;
		
	}
	
	public double calcularArea() {
		double area = Math.pow(lado, 2);
		return area;
	}
	public double calcularPerimetro() {
		double perimetro = lado * 4;
		return perimetro;
		}
	
	public void mostrarDados() {
		System.out.println("-----------------");
		System.out.println("DADOS DO QUADRADO");
		System.out.println("-----------------");
		System.out.println("LADO: " + lado );
		System.out.println("AREA: " + calcularArea());
		System.out.println("PERIMETRO: " + calcularPerimetro());
		System.out.println("-----------------");
		System.out.println("");
		
	
		
		
		
		
	
	
	    }
	}
	
	
	
	
