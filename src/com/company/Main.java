package com.company;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        String line = in.readLine();
        Matcher m = Pattern.compile("\\b[A-ZА-ЯЁ]{2,6}\\b").matcher(line);
        String s;
        while (m.find()) {
            System.out.println(m.group());
            try (FileWriter writer = new FileWriter("output.txt");
                 BufferedWriter bw = new BufferedWriter(writer)) {

                bw.write(m.group());
            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            }
        }
    }
}