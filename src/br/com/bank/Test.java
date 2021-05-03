package br.com.bank;

/**
 * Class made to test the program's functionalities
 * 
 * @author Marcio Cintra
 * @version 1.0
 * @since 05/03/2021 (American Date Format)
 */
public class Test {

	/**
	 * Main method used to test the program's functionalities
	 * 
	 * @param args Main method's default parameter.
	 */
	public static void main(String[] args) {
		Client client1 = new Client("Marcio", "Aclimacao", "12312312312");
		Client client2 = new Client("Carlos", "Vila Mariana", "434343434343");
		client1.getCpf();
		client1.getName();
		client1.getPostalAddress();
		client1.setCpf("123");
		client1.setName("Marcao");
		client1.setPostalAddress("Capao Redondo");

		Account account1 = new Account(client1, 123);
		Account account2 = new Account(client2, 321);
		account1.showBalance();
		account1.cashOut(123);
		account1.showBalance();
		account1.deposit(12332);
		account1.showBalance();
		account1.setAgency(1);
		account1.transfer(123, account2);
		account1.showBalance();
		System.out.println(account1.getAgency());
		System.out.println(account1.getBalance());
		System.out.println(account1.getClientName());
	}
}
