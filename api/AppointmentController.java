@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping
    public void createAppointment(@RequestBody Appointment appointment) {
        appointmentService.bookAppointment(appointment);
    }

    @GetMapping("/{id}")
    public Appointment getAppointment(@PathVariable String id) {
        return appointmentService.getAppointment(id);
    }

    @DeleteMapping("/{id}")
    public void cancelAppointment(@PathVariable String id) {
        appointmentService.cancelAppointment(id);
    }
}
