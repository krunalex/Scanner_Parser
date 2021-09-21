package pizzaprojekt.model.people;

public abstract class Human {
    protected String forename;
    protected String surname;
    protected String[] nameList;
    private Human[] human;

    public Human(){
        Human[] h= new Human[3];
        h[0] = new Guest();
        h[1] = new Worker();
        h[2] = new Worker();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String[] getNameList(){ return nameList; }

    public void setNameList(String[] nameList){}

    public String getForename() {
        return forename;
    }

    public abstract void setForename();


}
