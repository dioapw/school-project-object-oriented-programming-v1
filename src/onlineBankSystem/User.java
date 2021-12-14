package onlineBankSystem;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Dio Aditya Putra Wardhono
 * @NIM 1301194290
 *
 */
public class User {

    /**
     * Gender enum class
     */
    public enum Gender {
        MALE,
        FEMALE
    }

    private int user_id;
    private String user_name;
    private String user_email;
    private int user_age;
    private Gender user_gender;
    private LocalDate user_date_of_birth;
    private String user_address;
    private String user_phone;
    private String username;
    private String password;

    /**
     *
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
    public User(int user_id, String user_name, String user_email, String user_gender, String user_date_of_birth, String user_address, String user_phone, String username, String password) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_email = user_email;
        setUser_date_of_birth(user_date_of_birth);
        setUser_age(this.user_date_of_birth);
        setUser_gender(user_gender);
        this.user_address = user_address;
        this.user_phone = user_phone;
        this.username = username;
        this.password = password;
    }

    /**
     *
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
    public User(int user_id, String user_name, String user_email, int user_age, Gender user_gender, LocalDate user_date_of_birth, String user_address, String user_phone, String username, String password) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_age = user_age;
        this.user_gender = user_gender;
        this.user_date_of_birth = user_date_of_birth;
        this.user_address = user_address;
        this.user_phone = user_phone;
        this.username = username;
        this.password = password;
    }

    /**
     *
     * @return user_id
     */
    public int getUser_id() {
        return user_id;
    }

    /**
     *
     * @param user_id
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    /**
     *
     * @return user_name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     *
     * @param user_name
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     *
     * @return user_email
     */
    public String getUser_email() {
        return user_email;
    }

    /**
     *
     * @param user_email
     */
    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    /**
     *
     * @return user_age
     */
    public int getUser_age() {
        return user_age;
    }

    /**
     *
     * @param user_date_of_birth
     */
    public void setUser_age(LocalDate user_date_of_birth) {
        Period p = Period.between(user_date_of_birth, LocalDate.now());
        user_age = p.getYears();
    }

    /**
     *
     * @param user_age
     */
    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    /**
     *
     * @return user_gender
     */
    public Gender getUser_gender() {
        return user_gender;
    }

    /**
     *
     * @param user_gender
     */
    public void setUser_gender(String user_gender) {
        if (null != user_gender) {
            switch (user_gender) {
                case "male":
                    this.user_gender = Gender.MALE;
                    break;
                case "female":
                    this.user_gender = Gender.FEMALE;
                    break;
                default:
                    System.out.println("False Input of Gender");
                    break;
            }
        } else {
            System.out.println("Empty Input");
        }
    }

    /**
     *
     * @param user_gender
     */
    public void setUser_gender(Gender user_gender) {
        this.user_gender = user_gender;
    }

    /**
     *
     * @return user_date_of_birth
     */
    public LocalDate getUser_date_of_birth() {
        return user_date_of_birth;
    }

    /**
     *
     * @param user_date_of_birth
     */
    public void setUser_date_of_birth(String user_date_of_birth) {
        this.user_date_of_birth = LocalDate.parse(user_date_of_birth, DateTimeFormatter.ofPattern("dd MMM uuuu"));
    }

    /**
     *
     * @param user_date_of_birth
     */
    public void setUser_date_of_birth(LocalDate user_date_of_birth) {
        this.user_date_of_birth = user_date_of_birth;
    }

    /**
     *
     * @return user_address
     */
    public String getUser_address() {
        return user_address;
    }

    /**
     *
     * @param user_address
     */
    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    /**
     *
     * @return user_phone
     */
    public String getUser_phone() {
        return user_phone;
    }

    /**
     *
     * @param user_phone
     */
    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    /**
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
