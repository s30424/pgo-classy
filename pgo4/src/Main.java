public class Main {
    public static void main(String[] args) {
    Student student = new Student("Paul","Atowskij","jakiejkolwiek@gmail.com","Zlota 44","94242292", new double[]{4.0, 3.5, 4.0});
    StudentGroup studenci = new StudentGroup();
    studenci.grupa = "studenci123";
    student.obliczsrednia (new double[]{4.0, 3.5, 4.0});
    }
}
