package testing;

public class Address {

    private String streeet;
    private String number;

    public Address(String streeet, String number) {
        this.streeet = streeet;
        this.number = number;
    }

    public String getStreeet() {
        return streeet;
    }

    public void setStreeet(String streeet) {
        this.streeet = streeet;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
