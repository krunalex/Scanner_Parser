package Pizzaprojekt.model.People;

public abstract class Human {
    protected String forename;
    protected String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getForename() {
        return forename;
    }

    public void setForname(String forname) {
        this.forename = forname;
    }
}
