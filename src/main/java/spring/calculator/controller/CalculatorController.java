package spring.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String helloCalculator() {
        return "Добро поаловать в калькулятор.";
    }

    @GetMapping(value = "/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer userNum1,
                       @RequestParam(value = "num2", required = false) Integer userNum2) {
        return buildView(userNum1, userNum2, "+");
    }

    @GetMapping(value = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer userNum1,
                        @RequestParam(value = "num2", required = false) Integer userNum2) {
        return buildView(userNum1, userNum2, "-");
    }

    @GetMapping(value = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer userNum1,
                           @RequestParam(value = "num2", required = false) Integer userNum2) {
        return buildView(userNum1, userNum2, "*");
    }

    @GetMapping(value = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer userNum1,
                         @RequestParam(value = "num2", required = false) Integer userNum2) {
        return buildView(userNum1, userNum2, "/");
    }

    private String buildView(Integer userNum1,
                             Integer userNum2,
                             String operation) {
        if(userNum1 == null || userNum2 == null) {
            return "Введите параметры.";
        }
        if ("/".equals(operation) && userNum2 == 0) {
            return "На ноль делить нельзя.";
        }
        Number result;
        switch (operation) {
            case "-":
                result = calculatorService.minus(userNum1, userNum2);
                break;
            case "*":
                result = calculatorService.multiply(userNum1, userNum2);
                break;
            case "/":
                result = calculatorService.divide(userNum1, userNum2);
                break;
            default:
                result = calculatorService.plus(userNum1, userNum2);
        }
    return userNum1 + " " + operation + " " + userNum2 + " = " + result;
    }
}
