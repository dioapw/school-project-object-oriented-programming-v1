package onlineBankSystem;

import java.util.ArrayList;

/**
 *
 * @author Dio Aditya Putra Wardhono
 * @NIM 1301194290
 *
 */
public class Admin {

    private ArrayList<Customer> grant_customer;
    private ArrayList<Teller> grant_teller;
    private ArrayList<Role> grant_role;
    private ArrayList<Permission> grant_permission;

    /**
     *
     * @param grant_customer
     * @param grant_teller
     * @param grant_role
     * @param grant_permission
     */
    public Admin(Customer grant_customer, Teller grant_teller, Role grant_role, Permission grant_permission) {
        this.grant_customer.add(grant_customer);
        this.grant_teller.add(grant_teller);
        this.grant_role.add(grant_role);
        this.grant_permission.add(grant_permission);
    }

    /**
     *
     * @param grant_customer
     * @param grant_teller
     * @param grant_role
     * @param grant_permission
     */
    public Admin(ArrayList<Customer> grant_customer, ArrayList<Teller> grant_teller, ArrayList<Role> grant_role, ArrayList<Permission> grant_permission) {
        this.grant_customer = grant_customer;
        this.grant_teller = grant_teller;
        this.grant_role = grant_role;
        this.grant_permission = grant_permission;
    }

    /**
     *
     * @return
     */
    public ArrayList<Customer> getGrant_customer() {
        return grant_customer;
    }

    /**
     *
     * @param grant_customer
     */
    public void setGrant_customer(ArrayList<Customer> grant_customer) {
        this.grant_customer = grant_customer;
    }

    /**
     *
     * @param grant_customer
     */
    public void setGrant_customer(Customer grant_customer) {
        this.grant_customer.add(grant_customer);
    }

    /**
     *
     * @return
     */
    public ArrayList<Teller> getGrant_teller() {
        return grant_teller;
    }

    /**
     *
     * @param grant_teller
     */
    public void setGrant_teller(ArrayList<Teller> grant_teller) {
        this.grant_teller = grant_teller;
    }

    /**
     *
     * @param grant_teller
     */
    public void setGrant_teller(Teller grant_teller) {
        this.grant_teller.add(grant_teller);
    }

    /**
     *
     * @return
     */
    public ArrayList<Role> getGrant_role() {
        return grant_role;
    }

    /**
     *
     * @param grant_role
     */
    public void setGrant_role(ArrayList<Role> grant_role) {
        this.grant_role = grant_role;
    }

    /**
     *
     * @param grant_role
     */
    public void setGrant_role(Role grant_role) {
        this.grant_role.add(grant_role);
    }

    /**
     *
     * @return
     */
    public ArrayList<Permission> getGrant_permission() {
        return grant_permission;
    }

    /**
     *
     * @param grant_permission
     */
    public void setGrant_permission(ArrayList<Permission> grant_permission) {
        this.grant_permission = grant_permission;
    }

    /**
     *
     * @param grant_permission
     */
    public void setGrant_permission(Permission grant_permission) {
        this.grant_permission.add(grant_permission);
    }

}
