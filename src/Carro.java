import java.lang.annotation.Documented;

public class Carro {
	
	private String nome;
	private int velocidade;
	private int potencia;
	
	public Carro (String n, int v , int pot)
	{
		this.nome = n;
		this.velocidade = v;
		this.potencia = pot;
	}
	
	@Override
	public String toString()
	{
		String retorno;
		retorno = this.nome;
		retorno += " \nVelocidade máxima: " + this.velocidade;
		retorno += " \nPotência: " + this.potencia;
		return retorno;
		
	}
	
	public int getVelocidade()
	{return this.velocidade;}
	
	public void acelerar()
	{
		this.velocidade = this.velocidade*potencia;
	}
	
	public void frear()
	{
		this.velocidade -= 5;
	}

}
