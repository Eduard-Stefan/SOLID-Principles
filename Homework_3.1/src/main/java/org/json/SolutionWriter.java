package org.json;

import java.io.FileWriter;
import java.io.IOException;

public class SolutionWriter {
    public static void writeSolution(JSONObject solution) {
        try (FileWriter file = new FileWriter("src/main/resources/solution.json")) {
            file.write(solution.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}