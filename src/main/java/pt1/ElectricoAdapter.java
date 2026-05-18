package pt1;

public class ElectricoAdapter implements Motor {

    private Electrico motorElectrico;

    //recibe el objeto a adaptar
    public ElectricoAdapter(Electrico motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void arrancar() {
        System.out.println("Adaptador: Traduciendo 'arrancar' a motor electrico:");
        motorElectrico.conectar();
        motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Adaptador: Traduciendo 'acelerar' a motor eléctrico:");
        motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Adaptador: Traduciendo 'apagar' a motor eléctrico:");
        motorElectrico.detener();
        motorElectrico.desconectar();
    }
}
