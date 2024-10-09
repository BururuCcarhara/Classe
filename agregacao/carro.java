package relacao.agregacao;

public class carro {
	private String modelo;
	private Motor motor;

	public carro(String modelo, Motor motor) {
	this.modelo=modelo;
	this.motor =motor;
}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;

	}
}