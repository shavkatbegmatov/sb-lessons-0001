package brb.team.brr.controller;

import brb.team.brr.dto.UserAddRequest;
import brb.team.brr.service.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/brb/general")
public class TestController {
    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }
    @GetMapping("/name")
    public ResponseEntity<?> getName(@RequestParam(value = "a") int a,
                                          @RequestParam(value = "b") int b) {
        return ResponseEntity.ok(testService.calculate(a, b));
    }

    @PostMapping("/userAdd")
    public ResponseEntity<?> userAdd(@RequestBody UserAddRequest userAddRequest) {
        return ResponseEntity.ok(testService.userAdd(userAddRequest));
    }
}
