package model;

public class Caminhao extends Veiculo {

	private String marca;
	private int ano;

	public Caminhao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Caminhao(String modelo, int velocidade, int passageiro, int combustivel, String marca, int ano) {
		super(modelo, velocidade, passageiro, combustivel);

		this.marca = marca;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	
	public void abastecer(float qtd) {
		
		int intQtd = (int) qtd;
		
		if(this.getCombustivel() <= 100) {
			this.combustivel += intQtd;
			this.setCombustivel(combustivel);
		}else {
			
			System.out.println("Tanque cheio");
		}
		
	}

	@Override
	public void acelerar() {
		
		if(this.getVelocidade() <= 160) {
			this.velocidade += 40;
			this.setVelocidade(velocidade);
		}else {
			
			System.out.println("Velocidade maxima!");
		}
		
	}
	
	

}
