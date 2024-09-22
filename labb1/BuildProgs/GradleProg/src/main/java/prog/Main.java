package prog;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Student Artur = new Student("Artur", "Yanchuk", "IO-34", 3);

//        System.out.println("Name:" + Artur.getName());
//        System.out.println("Surname:" + Artur.getSurname());
//        System.out.println("Group:" + Artur.getGroup());
//        System.out.println("Semestr:" + Artur.getSemestr());
//        System.out.println("----------------------");

        Gson gstudent = new Gson().newBuilder().setPrettyPrinting().create();
        String json = gstudent.toJson(Artur);
        System.out.println(json);

    }
}