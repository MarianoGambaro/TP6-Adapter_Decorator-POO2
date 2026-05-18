package pt1;

public class Main {
    static void main() {

        Sistema sistema = new Sistema();

        Motor motorComun = new Comun();
        Motor motorEconomico = new Economico();

        Electrico motorElectrico = new Electrico();

        //le pasamos el motor electrico al adapter para que sea compatible con el sistema
        Motor adaptadorElectrico = new ElectricoAdapter(motorElectrico);

        //El sistema los trata a todos por igual (Polimorfismo gracias al Adapter)
        sistema.agregarMotor(motorComun);
        sistema.agregarMotor(motorEconomico);
        sistema.agregarMotor(adaptadorElectrico);

        sistema.accion();
    }
}
