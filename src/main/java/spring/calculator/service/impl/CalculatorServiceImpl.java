package spring.calculator.service.impl;

import org.springframework.stereotype.Service;
import spring.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public int plus(int userNum1, int userNum2) {
        return userNum1 + userNum2;
    }

    public int minus(int userNum1, int userNum2) {
        return userNum1 - userNum2;
    }

    public int multiply(int userNum1, int userNum2) {
        return userNum1 * userNum2;
    }

    public double divide(double userNum1, double userNum2) {
        return userNum1 / userNum2;
    }
}
