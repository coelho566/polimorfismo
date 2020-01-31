package model;

public abstract class Veiculo {
	
	private String modelo;
	protected int velocidade;
	private int passageiro;
	protected int combustivel;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String modelo, int velocidade, int passageiro, int combustivel) {
		super();
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.passageiro = passageiro;
		this.combustivel = combustivel;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(int passageiro) {
		this.passageiro = passageiro;
	}

	public int getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}
	
	public void abastecer(int qtd) {
		
		if(this.getCombustivel() <= 100) {
			this.combustivel += qtd;
			this.setCombustivel(combustivel);
		}else {
			
			System.out.println("Tanque cheio");
		}
	}
	
	public abstract void acelerar();


	



	
	
}
