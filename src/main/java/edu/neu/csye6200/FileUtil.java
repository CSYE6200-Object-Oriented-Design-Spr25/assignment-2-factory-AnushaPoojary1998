package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	
	public FileUtil() {
    }

    public static List<String> readfile(Path fileName) {
        List<String> lines = new ArrayList();

        try {
            BufferedReader br = Files.newBufferedReader(fileName);

            String line;
            try {
                while((line = br.readLine()) != null) {
                    lines.add(line);
                }
            } catch (Throwable var6) {
                if (br != null) {
                    try {
                        br.close();
                    } catch (Throwable var5) {
                        var6.addSuppressed(var5);
                    }
                }

                throw var6;
            }

            if (br != null) {
                br.close();
            }
        } catch (IOException var7) {
            var7.printStackTrace();
        }

        System.out.println("File " + fileName + " read successfully\n");
        System.out.println(lines);
        return lines;
    }

    public static void writefile(ItemAPI items, String filename) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

            try {
                writer.write(items.getName() + ",");
                writer.write(items.getPrice() + ",");
                writer.write(items.getLocation() + ",");
                writer.write("" + items.getID());
                writer.newLine();
            } catch (Throwable var6) {
                try {
                    writer.close();
                } catch (Throwable var5) {
                    var6.addSuppressed(var5);
                }

                throw var6;
            }

            writer.close();
        } catch (IOException var7) {
            var7.printStackTrace();
        }

        System.out.println("File " + filename + " written successfully.");
    }
	

}
