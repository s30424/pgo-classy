public class Student {
    public String fname;
    public String lname;
    public String email;
    public String adress;
    public String indexNnumber;
    public double[] ocena;

    public Student(String fname, String lname, String email, String adress, String indexNnumber, double[] ocena) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.adress = adress;
        this.indexNnumber = indexNnumber;
        this.ocena = ocena;
    }
    public double obliczsrednia (double[] doubles) {
        this.ocena = ocena;
        double sumaocen = 0;
            if (ocena.length < 20) {
                for (int i = 0; i < ocena.length; i++) {
                sumaocen = sumaocen + ocena[i];
            }
                double srednia = sumaocen / ocena.length;
                double ocenakoncowa = 0;
                if (srednia <= 2.4) {
                    ocenakoncowa =2;
                }
                if (srednia > 2.4 && srednia <= 2.5) {
                    ocenakoncowa =2.5;
                }
                if (srednia > 2.5 && srednia <= 3.4) {
                    ocenakoncowa =3;
                }
                if (srednia > 3.4 && srednia <= 3.5) {
                    ocenakoncowa =3.5;
                }
                if (srednia > 3.5 && srednia <= 4.4) {
                    ocenakoncowa =4;
                }
                if (srednia > 4.4 && srednia <= 4.5) {
                    ocenakoncowa =4.5;
                }
                if (srednia > 4.5 && srednia <= 5.0) {
                    ocenakoncowa =5;
                }
                if (srednia >5 || srednia ==0 ){
                    throw new IllegalArgumentException("podana ocena jest za wysoka");
                }
                return ocenakoncowa;
            }
            else {
                throw new IllegalArgumentException("za duza liczba ocen");
            }
    }
}

