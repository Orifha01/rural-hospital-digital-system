@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping
    public void createDoctor(@RequestBody Doctor doctor) {
        doctorService.addDoctor(doctor);
    }

    @GetMapping("/{id}")
    public Doctor getDoctor(@PathVariable String id) {
        return doctorService.getDoctor(id);
    }
}
