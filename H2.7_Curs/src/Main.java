public class Main {
    public static void main(String[] args) {
        Curs curs = new Curs();

        Student s1 = new Student("Andrei");
        curs.inregistreazaStudent(s1);
        Student s2 = new Student("George");
        curs.inregistreazaStudent(s2);
        Student s3 = new Student("Crin");
        curs.inregistreazaStudent(s3);
        Student s4 = new Student("Gagarin");
        curs.inregistreazaStudent(s4);
        Student s5 = new Student("Yuri");
        curs.inregistreazaStudent(s5);


        curs.prezenta();

    }
}