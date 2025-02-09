/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sakshisawant
 */
public class FileUtil {
    public static List<String> readCSV(String filePath) {
        List<String> data = new ArrayList<>();
        try (BufferedReader rd = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = rd.readLine()) != null) {
                data.add(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return data;
    }

    public static void writeCSV(String filePath, List<String[]> data) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (String[] row : data) {
                String line = String.join(",", row);
                bw.write(line);
                bw.newLine();
            }
        }
    }
}

