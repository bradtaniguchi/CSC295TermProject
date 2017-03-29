package Problem2_ShoppingCheckOutSim.Models;
/**
 *
 * @author brad
 */
public class User {
    private Title title;
    private String firstName;
    private String lastName;
    private String address1;
    private String address2;
    private String city;
    private State state;
    private int postal;
    private String visa;
    
    public User(Title title, String firstName, String lastName, String address1,
        String address2, String city, State state, int postal, String visa) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postal = postal;
        this.visa = visa;
    }
    public User() {
        this.title = Title.Mr;
        this.firstName = "";
        this.lastName = "";
        this.address1 = "";
        this.address2 = "";
        this.city = "";
        this.state = State.California;
        this.postal = 0;
        this.visa = "";
    }
    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getPostal() {
        return postal;
    }

    public void setPostal(int postal) {
        this.postal = postal;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }
        

}
