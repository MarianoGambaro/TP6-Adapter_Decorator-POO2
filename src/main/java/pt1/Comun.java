package pt1;

public class Comun implements Motor {
    @Override
    public void arrancar() {
        System.out.println("Motor clasico: arrancando");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor clasico: acelerando");
    }

    @Override
    public void apagar() {
        System.out.println("Motor clasico: apagando");
    }
}
