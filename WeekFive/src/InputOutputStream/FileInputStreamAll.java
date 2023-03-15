package InputOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class FileInputStreamReadAllChar {
    public static void readAllChar(){
        try{
            FileInputStream file = new FileInputStream("writestring.txt");

            int i=0;
            while((i=file.read())!=-1){
                System.out.print((char)i);
            }

            file.close();
            System.out.println("\nReading Successful....!!");

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class FileInputStreamReadSingleChar {
    public static  void readSingleChar(){
        try{
            FileInputStream file = new FileInputStream("writebyte.txt");
            int i = file.read();
            System.out.println((char)i);

            file.close();
            System.out.println("Reading Successful....!!");

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class FileOutputStreamWriteString {
    public static void writeString() {
        Scanner scanner = new Scanner(System.in);

        try {
            //creating file
            FileOutputStream file = new FileOutputStream("writestring.txt");

            // taking input to write in file
            System.out.println("Enter sentence to write in file : ");
            String s = scanner.nextLine();

            byte b[] = s.getBytes();//converting string into byte array
            file.write(b);    // writing
            file.close();    // closing the file

            System.out.println("Writing Successful...!!");

        } catch (
                Exception e) {
            System.out.println(e);
        }
    }
}
class FileOutputStreamWriteByte{
            public static void writeByte(){
                Scanner scn = new Scanner(System.in);

                try {
                    // creating file
                    FileOutputStream file = new FileOutputStream("writebyte.txt");

                    System.out.println("Enter how many char you want to add : ");
                    int n = scn.nextInt();

                    // writing to the file
                    System.out.println("Enter "+n+" ASCII code for character : ");
                    while(n!=0) {
                        int asciiCode = scn.nextInt();
                        file.write(asciiCode);
                        n--;
                    }
                    file.close();
                    System.out.println("Writing Successful....!");

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            }


public class FileInputStreamAll {
    public static void main(String args[]) {
        FileOutputStreamWriteString.writeString();
        FileOutputStreamWriteByte.writeByte();
        FileInputStreamReadAllChar.readAllChar();
        FileInputStreamReadSingleChar.readSingleChar();
    }
}
