package excelparser;

import java.util.List;

public interface FileHandler {
    void storeData(String[] headers, List<Matrik> matriks);
}
