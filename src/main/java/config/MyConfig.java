package config;

import Days.*;
import org.springframework.context.annotation.Bean;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MyConfig {
    @Bean
    public WeekDay getWeekDay() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek) {
            case SUNDAY:
                return new Sunday();
            case MONDAY:
                return new Monday();
            case TUESDAY:
                return new Tuesday();
            case WEDNESDAY:
                return new Wednesday();
            case FRIDAY:
                return new Friday();
            case SATURDAY:
                return new Saturday();
            default:
                return new Thursday();
        }
    }
}
