package pt1;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<Motor> motores = new ArrayList<>();

    public void accion() {
        System.out.println("Prueba sistema de uso de motores---------");
        for (Motor m : motores) {
            m.arrancar();
            m.acelerar();
            m.apagar();
            System.out.println("---------------------------------------");
        }
    }

    public void agregarMotor(Motor motor) {
        this.motores.add(motor);
    }
}
