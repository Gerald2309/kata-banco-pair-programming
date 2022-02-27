// TODO: 27/02/2022 CODIGO MUERTO 

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dia {
    public static LocalDate format(String date) {
        date = date.replace('/', '-');
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}