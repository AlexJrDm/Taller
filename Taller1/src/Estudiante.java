public class Estudiante extends Persona{
    double calification;

    public Estudiante( double calification, String nanmes, int age, String cityubication) {
        super(nanmes, age, cityubication);
        this.calification = calification;
    }


    public double getCalification() {
        return calification;
    }



}
