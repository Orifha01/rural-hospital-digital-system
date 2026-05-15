@SpringBootTest
@AutoConfigureMockMvc
public class PatientControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturn200() throws Exception {

        mockMvc.perform(get("/api/patients/P1"))
                .andExpect(status().isOk());
    }
}
