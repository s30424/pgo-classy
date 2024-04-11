import java.util.ArrayList;
public class StudentGroup {
    public String grupa;
    ArrayList<Student> lista = new ArrayList<Student>();
    public void DodajStudenta(Student student){
        if(lista.contains(student)){
            throw new IllegalStateException("Taki student juz jest");
        }
        if (lista.size() <= 15){
            lista.add(student);
        }
        else {
            throw new IllegalStateException("Za duzo studentow");
        }
    }

}
