// triângulo equilátero -> todos os lados iguais
//triângulo isósceles -> dois dos lados iguais
//triângulo escaleno -> todos os lados diferentes
public class Triangulo {
	
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	Triangulo(double ladoA, double ladoB, double ladoC){
		this.ladoA =  ladoA;
		this.ladoA =  ladoB;
		this.ladoA =  ladoC;
	}
	
	@Override
	public String toString() {
		return this.ladoA+"  "+this.ladoB+"   "+this.ladoC;
	}
	

}
