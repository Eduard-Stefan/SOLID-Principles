package org.json;

public class Main {
    public static void main(String[] args) {
        double a = 2;
        System.out.println("a = " + a);
        double b = 2;
        System.out.println("b = " + b);
        JSONObject solution = EquationSolver.solveEquation(a, b);
        System.out.println(solution);
        SolutionWriter.writeSolution(solution);
    }
}