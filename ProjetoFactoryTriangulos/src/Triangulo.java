// tri�ngulo equil�tero -> todos os lados iguais
//tri�ngulo is�sceles -> dois dos lados iguais
//tri�ngulo escaleno -> todos os lados diferentes
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
