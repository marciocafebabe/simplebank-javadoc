package br.com.bank;

/**
 * Class that can generate a Client Object.
 * 
 * @author Marcio Cintra
 * @version 1.0
 * @since 05/03/2021 (American Date Format)
 */
public class Client {
	private String name;
	private String postalAddress;
	private String cpf;

	/**
	 * Constructor method using fields. It creates the object Client by setting some
	 * initial values to it.
	 * 
	 * @param name          The name of the client
	 * @param postalAddress The postal address of the client
	 * @param cpf           The client's CPF (Search for Brazilian CPF)
	 */
	public Client(String name, String postalAddress, String cpf) {
		this.name = name;
		this.postalAddress = postalAddress;
		this.cpf = cpf;
	}

	/**
	 * Method that returns the value of the object's attribute as an String.
	 * 
	 * @return The client's CPF value
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Method that sets the value of the object's attribute to a new value.
	 * 
	 * @param cpf The client's new CPF value
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Method that returns the value of the object's attribute as an String.
	 * 
	 * @return The client's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method that sets the value of the object's attribute to a new value.
	 * 
	 * @param name The client's new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method that returns the value of the object's attribute as an String.
	 * 
	 * @return The client's postal address
	 */
	public String getPostalAddress() {
		return postalAddress;
	}

	/**
	 * Method that sets the value of the object's attribute to a new value.
	 * 
	 * @param postalAddress The client's new postal address
	 */
	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

}
