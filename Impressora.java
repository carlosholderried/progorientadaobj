package produtos;

public class Impressora extends Produtos {

	protected double ppm;
	
	
	
	public Impressora(String marca, double precocusto) {
		super(marca, precocusto);
		// TODO Auto-generated constructor stub
	}

	
	public double getPpm() {
		return ppm;
	}
	public void setPpm(double ppm2) {
		this.ppm = ppm2;
	}

	@Override
	public String toString()
	{
		return super.toString() + " \n impressora " + ppm + " paginas por minuto";							
	}	
	
	
}
