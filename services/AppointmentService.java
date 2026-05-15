public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public void bookAppointment(Appointment appointment) {

        if (appointment == null) {
            throw new RuntimeException("Appointment cannot be null");
        }

        appointmentRepository.save(appointment);
    }

    public Appointment getAppointment(String id) {
        return appointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not found"));
    }

    public void cancelAppointment(String id) {
        appointmentRepository.delete(id);
    }
}
