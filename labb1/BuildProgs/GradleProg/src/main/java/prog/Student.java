package prog;

public class Student {
    private String name;
    private String surname;
    private String group;
    private int semestr;

    public Student(String name, String surname, String group, int semestr) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.semestr = semestr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getSemestr() {
        return semestr;
    }

    public void setSemestr(int semestr) {
        this.semestr = semestr;
    }
}
