package pt3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SobrescribirReporte implements Exportador {
    private Report report;

    public SobrescribirReporte(Report report) {
        this.report = report;
    }

    public void exportar(File file) {
        if (file != null && file.exists()) {
            try (FileWriter fw = new FileWriter(file)) { //lo abro y cierro sin true para limpiarlo
            } catch (IOException e) {
                throw new RuntimeException("No se pudo limpiar el archivo para sobrescribir", e);
            }
        }
        report.exportar(file);
    }

}
