package pt3;

import java.io.File;

public class Main {
    static void main() {

        File archivoTxt = new File("C:/Users/marti/OneDrive/Documents/UNI/3er año 26/Objetos 2/TP/TP 6 - Adapter y Decorator/reporte.txt");
        Report reporteSimple = new Report("sobrescribo");
//        reporteSimple.exportar(archivoTxt);

        SobrescribirReporte sobrescribe = new SobrescribirReporte(reporteSimple);
        sobrescribe.exportar(archivoTxt);

//        ValidarExistenciaReporte validar = new ValidarExistenciaReporte(reporteSimple);
//        validar.exportar(archivoTxt);

    }
}
