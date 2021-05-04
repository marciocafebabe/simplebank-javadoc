package br.com.bank.account;

import br.com.bank.client.Client;

/**
 * Class that can generate an Account object.
 * 
 * @author Marcio Cintra
 * @version 1.0
 * @since 05/03/2021 (American Date Format)
 */
public class Account {
	protected Client client;
	protected double balance;
	protected int agency;

	/**
	 * Constructor method using fields. It creates the object Client by setting some
	 * initial values to it. It additionally initializes the account's balance by a
	 * method and links the account to an existing client.
	 * 
	 * @see init Method that initializes the account's balance.
	 * @see Client
	 * @param client The account's client (object)
	 * @param agency The account's agency
	 */
	public Account(Client client, int agency) {
		this.client = client;
		this.agency = agency;
		this.init();
	}

	/**
	 * Method that initializes the account's balance by setting the balance's value
	 * to 0.
	 * 
	 * @see Constructor "Account"
	 */
	private void init() {
		this.balance = 0;
	}

	/**
	 * Method that deposits an amount of money to the account.
	 * 
	 * @see cashOut
	 * @param amount The amount of money to be deposited
	 */
	public void deposit(double amount) {
		this.balance += amount;
	}

	/**
	 * Method that cashes out an amount of money from the account.
	 * 
	 * @see deposit
	 * @param amount The amount of money to be cashed out
	 */
	public void cashOut(double amount) {
		this.balance -= amount;
	}

	/**
	 * Method that cashes out an amount of money from the account and deposits it to
	 * another one.
	 * 
	 * @see cashOut
	 * @see deposit
	 * @param amount  The amount of money to be cashed out
	 * @param account The account that had the money cashed out is going to deposit
	 *                an amount of money to this account.
	 */
	public void transfer(double amount, Account account) {
		this.cashOut(amount);
		account.deposit(amount);
	}

	/**
	 * Method that returns the value of the object's attribute. The setBalance
	 * method was not implemented because bank operations methods make much more
	 * sense than a method that simply changes the balance value to another number
	 * just as it was a simple variable.
	 * 
	 * @see deposit
	 * @see cashOut
	 * @see transfer
	 * @return The account's balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Method that shows the account balance in a simple way. Similar to
	 * getBalance().
	 * 
	 * @see getBalance
	 */
	public void showBalance() {
		System.out.println("Balance: R$" + balance);
	}

	/**
	 * Method that returns the value of the object's attribute as an String. The
	 * setClient/setClientName method is not needed.
	 * 
	 * @return The client's name
	 */
	public String getClientName() {
		return client.getName();
	}

	/**
	 * Method that returns the value of the object's attribute as a number.
	 * 
	 * @return The agency number
	 */
	public int getAgency() {
		return agency;
	}

	/**
	 * Method that sets the value of the object's attribute to another one.
	 * 
	 * @param agency The agency's new number
	 */
	public void setAgency(int agency) {
		this.agency = agency;
	}

}
