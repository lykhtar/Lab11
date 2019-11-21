package lab11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab11 {

    public static void main(String[] args) {
        String path = "E:\\КПО\\text.txt";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
            XMLDoc doc = new XMLDoc(reader);
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
