package creational_patterns.simple_factory;

import model.Appointment;
import model.Patient;
import model.Doctor;
import java.time.LocalDateTime;

public class AppointmentFactory {

    public static Appointment createAppointment(String type, Patient p, Doctor d) {

        if (type.equalsIgnoreCase("emergency")) {
            return new Appointment("E-" + System.currentTimeMillis(), LocalDateTime.now(), p, d);
        }

        return new Appointment("N-" + System.currentTimeMillis(), LocalDateTime.now(), p, d);
    }
}
