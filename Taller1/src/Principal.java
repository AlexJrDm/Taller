
public class Principal {
 public static void main(String [] args){
    String name;
    int age;
    String city;
    double calification;

    Persona persona1 = new Persona("Alex", 19, "Santo Domingo ");
    Estudiante estudiante1 = new Estudiante(19.5, "Alex", 16, "Santo Domingo");
    System.out.println("Nombre de la persona: "+persona1.getNanmes());
    System.out.println("Edad de la persona: "+persona1.getAge());
    System.out.println("Ciudad donde vive: "+persona1.getUbication());
    System.out.println("");

    System.out.println("Nombre del estudiante: "+estudiante1.getNanmes());
    System.out.println("Edad de la persona: "+estudiante1.getAge());
    System.out.println("Ciudad donde vive: "+estudiante1.getUbication());
    System.out.println("Calificacion final del estudiante: "+estudiante1.getCalification());

 }
}
