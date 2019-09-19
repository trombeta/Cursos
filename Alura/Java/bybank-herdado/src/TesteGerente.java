public class TesteGerente {

	public static void main(String[] args) {
		
		Funcionario trombeta = new Gerente();
		//trombeta.setNome("Rodrigo Trombeta");
		//trombeta.setCpf("12345678901");
		trombeta.setSalario(5000.00);
		
		//System.out.println(trombeta.getNome());
		//System.out.println(trombeta.getCpf());
		//System.out.println(trombeta.getSalario());
		//System.out.println(trombeta.getBonificacao());
		
		//trombeta.setSenha(222);
		//boolean autenticou = trombeta.autentica(222);
		
		//System.out.println(autenticou);
		
		Funcionario rodrigo = new Funcionario();
		rodrigo.setSalario(2000.00);
		
		Funcionario rodrigotrombeta = new EditorVideo();
		rodrigotrombeta.setSalario(2250.00);
		
		Funcionario rodstrombeta = new Designer();
		rodstrombeta.setSalario(3000.00);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registro(trombeta);
		controle.registro(rodrigo);
		controle.registro(rodrigotrombeta);
		controle.registro(rodstrombeta);
		
		System.out.println("Total de Bonificações: " + controle.getSoma());
	}

}