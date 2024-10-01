@RestController
@RequestMapping("/identity")
public class IdentityController {
    @GetMapping("/exists/{ci}")
    public ResponseEntity<String> checkCI(@PathVariable String ci) {
        // Lógica para verificar si el CI existe o no
        boolean exists = ci.equals("123456");  // Simulación
        return ResponseEntity.ok(exists ? "CI exists" : "CI does not exist");
    }
}
