package org.json;

public class EquationSolver {
    public static JSONObject solveEquation(double a, double b) {
        JSONObject result = new JSONObject();
        if (a == 0) {
            if (b == 0) {
                result.put("message", "The equation has an infinity of solutions");
            } else {
                result.put("message", "The equation has no solution");
            }
        } else {
            double x = -b / a;
            result.put("solution", x);
        }
        return result;
    }
}