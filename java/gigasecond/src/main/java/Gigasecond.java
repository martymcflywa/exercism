import java.time.LocalDate;
import java.time.LocalDateTime;

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
