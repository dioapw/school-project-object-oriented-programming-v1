package onlineBankSystem;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Dio Aditya Putra Wardhono
 * @NIM 1301194290
 *
 */
public class Teller extends User {

    private Customer customer;
    private Account customer_account;
    private ArrayList<Deposit> customer_deposit;
    private ArrayList<Withdraw> customer_withdraw;
    private ArrayList<Card> customer_card;
    private ArrayList<Loan> customer_loan;

    /**
     *
     * @param customer
     * @param customer_account
     * @param customer_deposit
     * @param customer_withdraw
     * @param customer_card
     * @param customer_loan
     * @param user_id
     * @param user_name
     * @param user_email
     * @param user_gender
     * @param user_date_of_birth
     * @param user_address
     * @param user_phone
     * @param username
     * @param password
     */
    public Teller(Customer customer, Account customer_account, Deposit customer_deposit, Withdraw customer_withdraw, Card customer_card, Loan customer_loan, int user_id, String user_name, String user_email, String user_gender, String user_date_of_birth, String user_address, String user_phone, String username, String password) {
        super(user_id, user_name, user_email, user_gender, user_date_of_birth, user_address, user_phone, username, password);
        this.customer = customer;
        this.customer_account = customer_account;
        this.customer_deposit.add(customer_deposit);
        this.customer_withdraw.add(customer_withdraw);
        this.customer_card.add(customer_card);
        this.customer_loan.add(customer_loan);
    }

    /**
     *
     * @param customer
     * @param customer_account
     * @param customer_deposit
     * @param customer_withdraw
     * @param customer_card
     * @param customer_loan
     * @param user_id
     * @param user_name
     * @param user_email
     * @param user_age
     * @param user_gender
     * @param user_date_of_birth
     * @param user_address
     * @param user_phone
     * @param username
     * @param password
     */
    public Teller(Customer customer, Account customer_account, Deposit customer_deposit, Withdraw customer_withdraw, Card customer_card, Loan customer_loan, int user_id, String user_name, String user_email, int user_age, Gender user_gender, LocalDate user_date_of_birth, String user_address, String user_phone, String username, String password) {
        super(user_id, user_name, user_email, user_age, user_gender, user_date_of_birth, user_address, user_phone, username, password);
        this.customer = customer;
        this.customer_account = customer_account;
        this.customer_deposit.add(customer_deposit);
        this.customer_withdraw.add(customer_withdraw);
        this.customer_card.add(customer_card);
        this.customer_loan.add(customer_loan);
    }

    /**
     *
     * @param customer
     * @param customer_account
     * @param customer_deposit
     * @param customer_withdraw
     * @param customer_card
     * @param customer_loan
     * @param user_id
     * @param user_name
     * @param user_email
     * @param user_gender
     * @param user_date_of_birth
     * @param user_address
     * @param user_phone
     * @param username
     * @param password
     */
    public Teller(Customer customer, Account customer_account, ArrayList<Deposit> customer_deposit, ArrayList<Withdraw> customer_withdraw, ArrayList<Card> customer_card, ArrayList<Loan> customer_loan, int user_id, String user_name, String user_email, String user_gender, String user_date_of_birth, String user_address, String user_phone, String username, String password) {
        super(user_id, user_name, user_email, user_gender, user_date_of_birth, user_address, user_phone, username, password);
        this.customer = customer;
        this.customer_account = customer_account;
        this.customer_deposit = customer_deposit;
        this.customer_withdraw = customer_withdraw;
        this.customer_card = customer_card;
        this.customer_loan = customer_loan;
    }

    /**
     *
     * @param customer
     * @param customer_account
     * @param customer_deposit
     * @param customer_withdraw
     * @param customer_card
     * @param customer_loan
     * @param user_id
     * @param user_name
     * @param user_email
     * @param user_age
     * @param user_gender
     * @param user_date_of_birth
     * @param user_address
     * @param user_phone
     * @param username
     * @param password
     */
    public Teller(Customer customer, Account customer_account, ArrayList<Deposit> customer_deposit, ArrayList<Withdraw> customer_withdraw, ArrayList<Card> customer_card, ArrayList<Loan> customer_loan, int user_id, String user_name, String user_email, int user_age, Gender user_gender, LocalDate user_date_of_birth, String user_address, String user_phone, String username, String password) {
        super(user_id, user_name, user_email, user_age, user_gender, user_date_of_birth, user_address, user_phone, username, password);
        this.customer = customer;
        this.customer_account = customer_account;
        this.customer_deposit = customer_deposit;
        this.customer_withdraw = customer_withdraw;
        this.customer_card = customer_card;
        this.customer_loan = customer_loan;
    }

    /**
     *
     * @return
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     *
     * @param customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     *
     * @return
     */
    public Account getCustomer_account() {
        return customer_account;
    }

    /**
     *
     * @param customer_account
     */
    public void setCustomer_account(Account customer_account) {
        this.customer_account = customer_account;
    }

    /**
     *
     * @return
     */
    public ArrayList<Deposit> getCustomer_deposit() {
        return customer_deposit;
    }

    /**
     *
     * @param customer_deposit
     */
    public void setCustomer_deposit(ArrayList<Deposit> customer_deposit) {
        this.customer_deposit = customer_deposit;
    }

    /**
     *
     * @param customer_deposit
     */
    public void setCustomer_deposit(Deposit customer_deposit) {
        this.customer_deposit.add(customer_deposit);
    }

    /**
     *
     * @return
     */
    public ArrayList<Withdraw> getCustomer_withdraw() {
        return customer_withdraw;
    }

    /**
     *
     * @param customer_withdraw
     */
    public void setCustomer_withdraw(ArrayList<Withdraw> customer_withdraw) {
        this.customer_withdraw = customer_withdraw;
    }

    /**
     *
     * @param customer_withdraw
     */
    public void setCustomer_withdraw(Withdraw customer_withdraw) {
        this.customer_withdraw.add(customer_withdraw);
    }

    /**
     *
     * @return
     */
    public ArrayList<Card> getCustomer_card() {
        return customer_card;
    }

    /**
     *
     * @param customer_card
     */
    public void setCustomer_card(ArrayList<Card> customer_card) {
        this.customer_card = customer_card;
    }

    /**
     *
     * @param customer_card
     */
    public void setCustomer_card(Card customer_card) {
        this.customer_card.add(customer_card);
    }

    /**
     *
     * @return
     */
    public ArrayList<Loan> getCustomer_loan() {
        return customer_loan;
    }

    /**
     *
     * @param customer_loan
     */
    public void setCustomer_loan(ArrayList<Loan> customer_loan) {
        this.customer_loan = customer_loan;
    }

    /**
     *
     * @param customer_loan
     */
    public void setCustomer_loan(Loan customer_loan) {
        this.customer_loan.add(customer_loan);
    }

}
