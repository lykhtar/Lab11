package lab11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLDoc {

    XMLDoc(BufferedReader reader) {
        String path = "E:\\КПО\\text1.xml";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            parseXML(reader, writer);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void parseXML(BufferedReader reader, BufferedWriter writer) {
        try {
            String line;
            String beginTitle = "<title>";
            String endTitle = "</title>";
            String beginAuthors = "<author>";
            String endAuthors = "</author>";
            String beginText = "<text>";
            String endText = "</text>";
            List<String> lines = new ArrayList<String>();
            writer.write("<?xml version='1.0' encoding='UTF-8'?>");
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            String title = beginTitle.concat(lines.get(0).concat(endTitle));
            lines.remove(0);
            String author = beginAuthors.concat(lines.get(0).concat(endAuthors));
            lines.remove(0);
            writer.write("\n" + title);
            writer.write("\n" + author);
            writer.write("\n" + beginText + lines + endText);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
