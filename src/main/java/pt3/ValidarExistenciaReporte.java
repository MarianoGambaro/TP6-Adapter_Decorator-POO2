package pt3;

import java.io.File;

public class ValidarExistenciaReporte {
    private Report report;

    public ValidarExistenciaReporte(Report report) {
        this.report = report;
    }

    public void exportar(File file) {
        if (file.exists()) {
            throw new IllegalArgumentException("El archivo ya existe...");
        }
        report.exportar(file);
    }
}
