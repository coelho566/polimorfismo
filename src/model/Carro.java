package model;

public class Carro extends Veiculo {
	
	private String marca;
	private int portas;
	private int ano;
	
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Carro(String modelo, int velocidade, int passageiro, int combustivel, String marca, int portas, int ano) {
		super(modelo, velocidade, passageiro, combustivel);
		
		this.marca = marca;
		this.portas = portas;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void abastecer(int qtd) {
		super.abastecer(qtd);
		
	}

	@Override
	public void acelerar() {
		
		if(this.getVelocidade() <= 150) {
			this.velocidade += 50;
			this.setVelocidade(velocidade);
		}else {
			
			System.out.println("Velocidade maxima!");
		}
		
	}
	
	
	
}
