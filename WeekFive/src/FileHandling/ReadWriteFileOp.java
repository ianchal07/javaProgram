package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFileOp {
    public static void main(String[] args) {

        // Creating a new file
        File myFile = new File("tempcow.txt");
        try {
            myFile.createNewFile();
            System.out.println("File has been created successfully");
        } catch (IOException e) {
            System.out.println("Oops something wrong with creation");
            e.printStackTrace();
        }

        // Writing to a file
        try {
            FileWriter fileWriter = new FileWriter(myFile);
            fileWriter.write("Basic file writing opearation \n this is getting complex");
            System.out.println("writed in to the file");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Unable to write");
            e.printStackTrace();
        }


        // Reading a file
        try {
            System.out.println(": Reading the file \n");
            Scanner scn = new Scanner(myFile);
            while (scn.hasNextLine()) {
                String line = scn.nextLine();
                System.out.println(line);
            }
            scn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
