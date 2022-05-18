package ru.maxvagan;

public class clsPerson {
    private String persName;
    private String persSurname;

    public clsPerson(String persName, String persSurname) {
        this.persName = persName;
        this.persSurname = persSurname;
    }

    public String getPersName() {
        return persName;
    }

    public void setPersName(String persName) {
        this.persName = persName;
    }

    public String getPersSurname() {
        return persSurname;
    }

    public void setPersSurname(String persSurname) {
        this.persSurname = persSurname;
    }

    public void changePerson(clsPerson person) {
        person = new clsPerson("Ilya", "Lagutenko");
    }

    public void changePerson2(clsPerson person) {
        person.setPersName("Ilya");
        person.setPersSurname("Lagutenko");
    }

    @Override
    public String toString() {
        return "clsPerson{" +
                "persName=\"" + persName + "\"" +
                ", persSurname=\"" + persSurname + "\"" +
                "}";
    }
}
