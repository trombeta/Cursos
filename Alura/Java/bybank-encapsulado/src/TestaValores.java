public class TestaValores {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta(123, 321);		
		Conta conta2 = new Conta(456, 654);
		Conta conta3 = new Conta(789, 987);
		
		System.out.println("Total de Contas: " + Conta.getTotal());
	}
}