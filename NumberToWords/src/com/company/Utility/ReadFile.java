package com.company.Utility;

import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

    public List<String> readInputFile(){
        List<String> listOfLines = new LinkedList<>();

        try {
            FileInputStream stream = new FileInputStream(("config/input.txt"));
            Scanner s = new Scanner(stream);
            System.out.println("<-----Reading all lines in File and converting valid numbers to words----->");
            while (s.hasNext()) {
                String line = s.nextLine();
                if (line != null) {
                    listOfLines.add(line);
                }
            }
            s.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listOfLines;
    }
}
