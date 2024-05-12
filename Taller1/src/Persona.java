public class Persona {
    private String nanmes;
    private int age;
    private String cityUbication;

    public Persona(String nanmes, int age, String cityubication) {
        this.nanmes = nanmes;
        this.age = age;
        cityUbication = cityubication;
    }

    public String getNanmes() {
        return nanmes;
    }
    public int getAge() {
        return age;
    }
    public String getUbication() {
        return cityUbication;
    }
    
}
