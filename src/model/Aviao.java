package model;

public class Aviao extends Veiculo {

	private String tipo;
	private String uso;

	public Aviao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aviao(String modelo, int velocidade, int passageiro, int combustivel, String tipo, String uso) {
		super(modelo, velocidade, passageiro, combustivel);

		this.tipo = tipo;
		this.uso = uso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	
	public void abastecer(String qtd) {
		
		int intQtd = Integer.parseInt(qtd);
		
		if(this.getCombustivel() <= 100) {
			this.combustivel += intQtd;
			this.setCombustivel(combustivel);
		}else {
			
			System.out.println("Tanque cheio");
		}
		
	}

	@Override
	public void acelerar() {
		
		if(this.getVelocidade() <= 2000) {
			this.velocidade += 200;
			this.setVelocidade(velocidade);
		}else {
			
			System.out.println("Velocidade maxima!");
		}
		
	}

}
