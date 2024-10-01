@SpringBootTest
@AutoConfigureMockMvc
public class IdentityControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCheckCI() throws Exception {
        mockMvc.perform(get("/identity/exists/123456"))
                .andExpect(status().isOk())
                .andExpect(content().string("CI exists"));
    }
}
