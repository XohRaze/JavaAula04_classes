package Pessoas;

public class Pessoa {
	
	
	//Atributos
	private String nome;
	private String apelido;
	
	//Construtores
	
	public Pessoa(String name)
	{
		nome = name;
		
	}
	
	public Pessoa(String name,String apelid)
	{
		nome = name;
		apelido = apelid;
	}
	
	
	//Metodo
	public String getName()
	{
		return nome;
	}
	
	public String getApelido()
	{
		return apelido;
	}
	
}
