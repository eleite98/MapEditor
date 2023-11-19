package org.codeforall.iorns.utils;

import java.io.*;

public class FileManager {

    private static final String FILEPATH = "resources/cells.txt";

    public static String readFile() {
        String result = "";
        BufferedReader reader;
        String line;

        try {
            reader = new BufferedReader(new FileReader(FILEPATH));


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {

            while((line = reader.readLine()) != null)
            {
                result += line;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void writeToFile(String string){

        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter(FILEPATH));
            writer.write(string);
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
