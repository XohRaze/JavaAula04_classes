package Pessoas;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Pessoa p1 = new Pessoa("Antonio");
		Pessoa p2 = new Pessoa("Bruno", "Alves");
		
		System.out.println(p1.getName());
		System.out.println(p2.getName()+ " " + p2.getApelido());
	}

}
