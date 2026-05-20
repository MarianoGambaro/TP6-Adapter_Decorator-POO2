package pt3;

import java.io.File;
import java.io.FileWriter;

public class Report implements Exportador {
    private String reporte;

    public Report(String reporte) {
        this.reporte = reporte;
    }

    @Override
    public void exportar(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        //le agrego true para que no se pisen los reportes y asi darle sentido al SobreescribirReporte
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(this.reporte + System.lineSeparator());
        } catch (Exception e) {
            throw new RuntimeException("Error al exportar archivo", e);
        }
        System.out.println("Reporte guardado en: " + file.getName());
    }

}
