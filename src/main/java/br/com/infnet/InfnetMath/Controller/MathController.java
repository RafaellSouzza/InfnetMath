package br.com.infnet.InfnetMath.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MathController {

    @GetMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    @PostMapping("/add")
    public double addPost(@RequestBody Map<String, Double> body) {
        return body.get("a") + body.get("b");
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    @PostMapping("/subtract")
    public double subtractPost(@RequestBody Map<String, Double> body) {
        return body.get("a") - body.get("b");
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    @PostMapping("/multiply")
    public double multiplyPost(@RequestBody Map<String, Double> body) {
        return body.get("a") * body.get("b");
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b) {
        return a / b;
    }

    @PostMapping("/divide")
    public double dividePost(@RequestBody Map<String, Double> body) {
        return body.get("a") / body.get("b");
    }

    @GetMapping("/power")
    public double power(@RequestParam double a, @RequestParam double b) {
        return Math.pow(a, b);
    }

    @PostMapping("/power")
    public double powerPost(@RequestBody Map<String, Double> body) {
        return Math.pow(body.get("a"), body.get("b"));
    }
}
