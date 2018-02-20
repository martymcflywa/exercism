import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;

class Gigasecond {

    LocalDateTime result;

    Gigasecond(LocalDate birthDate) {
        result = birthDate.atStartOfDay().plusSeconds((long) Math.pow(10, 9));
    }

    Gigasecond(LocalDateTime birthDateTime) {
        result = birthDateTime.plusSeconds((long) Math.pow(10, 9));
    }

    LocalDateTime getDate() {
        return result;
    }
}
