package relacao.agregacao;

public class PrincipalCar {

	public static void main(String[] args) {
		Motor motor=new Motor ("V8");
		carro carro=new carro ("Mustang",motor);
		
		System.out.println("Carro é: "+carro.getModelo() + "\n motor: " + motor.getTipo());

	}

}
