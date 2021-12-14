package onlineBankSystem;

import java.util.LinkedList;

/**
 *
 * @author Dio Aditya Putra Wardhono
 * @NIM 1301194290
 *
 */
public class Admin {

    private LinkedList<Customer> grant_customer;
    private LinkedList<Teller> grant_teller;
    private LinkedList<Role> grant_role;
    private LinkedList<Permission> grant_permission;

    /**
     *
     * @param grant_customer
     * @param grant_teller
     * @param grant_role
     * @param grant_permission
     */
    public Admin(Customer grant_customer, Teller grant_teller, Role grant_role, Permission grant_permission) {
        this.grant_customer = new LinkedList<>();
        this.grant_customer.add(grant_customer);
        this.grant_teller = new LinkedList<>();
        this.grant_teller.add(grant_teller);
        this.grant_role = new LinkedList<>();
        this.grant_role.add(grant_role);
        this.grant_permission = new LinkedList<>();
        this.grant_permission.add(grant_permission);
    }

    /**
     *
     * @param grant_customer
     * @param grant_teller
     * @param grant_role
     * @param grant_permission
     */
    public Admin(LinkedList<Customer> grant_customer, LinkedList<Teller> grant_teller, LinkedList<Role> grant_role, LinkedList<Permission> grant_permission) {
        this.grant_customer = grant_customer;
        this.grant_teller = grant_teller;
        this.grant_role = grant_role;
        this.grant_permission = grant_permission;
    }

    /**
     *
     * @return grant_customer
     */
    public LinkedList<Customer> getGrant_customer() {
        return grant_customer;
    }

    /**
     *
     * @param grant_customer
     */
    public void setGrant_customer(LinkedList<Customer> grant_customer) {
        this.grant_customer = grant_customer;
    }

    /**
     *
     * @param grant_customer
     */
    public void setGrant_customer(Customer grant_customer) {
        this.grant_customer = new LinkedList<>();
        this.grant_customer.add(grant_customer);
    }

    /**
     *
     * @return grant_teller
     */
    public LinkedList<Teller> getGrant_teller() {
        return grant_teller;
    }

    /**
     *
     * @param grant_teller
     */
    public void setGrant_teller(LinkedList<Teller> grant_teller) {
        this.grant_teller = grant_teller;
    }

    /**
     *
     * @param grant_teller
     */
    public void setGrant_teller(Teller grant_teller) {
        this.grant_teller = new LinkedList<>();
        this.grant_teller.add(grant_teller);
    }

    /**
     *
     * @return grant_role
     */
    public LinkedList<Role> getGrant_role() {
        return grant_role;
    }

    /**
     *
     * @param grant_role
     */
    public void setGrant_role(LinkedList<Role> grant_role) {
        this.grant_role = grant_role;
    }

    /**
     *
     * @param grant_role
     */
    public void setGrant_role(Role grant_role) {
        this.grant_role = new LinkedList<>();
        this.grant_role.add(grant_role);
    }

    /**
     *
     * @return grant_permission
     */
    public LinkedList<Permission> getGrant_permission() {
        return grant_permission;
    }

    /**
     *
     * @param grant_permission
     */
    public void setGrant_permission(LinkedList<Permission> grant_permission) {
        this.grant_permission = grant_permission;
    }

    /**
     *
     * @param grant_permission
     */
    public void setGrant_permission(Permission grant_permission) {
        this.grant_permission = new LinkedList<>();
        this.grant_permission.add(grant_permission);
    }

}
