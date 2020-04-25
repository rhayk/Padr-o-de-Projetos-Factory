
public class FabricaDeTriangulos implements MontadoraDeTriangulos {


	public Triangulo criarTriangulo(String tipoTriangulo) {
		
		if(tipoTriangulo.equals("Escaleno")) {
			return new Escaleno();
		}
		
		if(tipoTriangulo.equals("Isosceles")) {
			return new Isosceles();
		}
		
		if(tipoTriangulo.equals("Equilatero")) {
			return new Equilatero();
		}
		
		return null;
	}

}
