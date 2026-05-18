package pt1;

public class Economico implements Motor {
    @Override
    public void arrancar() {
        System.out.println("Motor economico: arrancando");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor economico: acelerando");
    }

    @Override
    public void apagar() {
        System.out.println("Motor economico: apagando");
    }
}
