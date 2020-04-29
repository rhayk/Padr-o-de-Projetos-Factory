// triângulo equilátero -> todos os lados iguais
//triângulo isósceles -> dois dos lados iguais
//triângulo escaleno -> todos os lados diferentes

	public class Triangulo implements FiguraGeometricaBidimensional{
	
	private float ladoA;
	private float ladoB;
	private float ladoC;
	
	//[b-c]< a && a < b + c;
	private boolean condicaoExistencia(float a, float b, float c) {
		return Math.abs(b - c) < a && a < b + c;
	}
	
	Triangulo(double d, double e, double f){
		this.ladoA =  1;
		this.ladoB =  1;
		this.ladoC =  1;
	}
	
	
	
	
	public float getLadoA() {
		return ladoA;
	}


	public void setLadoA(float ladoA) {
		if(condicaoExistencia(ladoA, ladoB, ladoC)) {
		this.ladoA = ladoA;
	}
	}

	public float getLadoB() {
		return ladoB;
	}


	public void setLadoB(float ladoB) {
	if(condicaoExistencia(ladoA, ladoB, ladoC)) {
		this.ladoB = ladoB;
	}
	}

	public float getLadoC() {
		return ladoC;
	}

	
	public void setLadoC(float ladoC) {
		if(condicaoExistencia(ladoA, ladoB, ladoC)) {
		this.ladoC = ladoC;
	}

	}

	
	@Override
	public String getTipoFigura() {
		if(ladoA == ladoB && ladoB == ladoC)
			return "Equilátero";
		else if(ladoA != ladoB && ladoB != ladoC && ladoC != ladoA)
			return "Escaleno";
		else 
			return "Isósceles";
	}
	
	@Override
	public String toString() {
		return "["+this.ladoA+"  "+this.ladoB+"   "+this.ladoC+"]";
	}

	
	

}
