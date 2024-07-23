package homework.lesson7;

import java.io.*;

public class IOTest {
    public static void main(String[] args) throws IOException {
        IOTest test = new IOTest();
//        test.readByChars();
//        test.readByLines();
//        test.readByLineAndSaveInArray();
//        test.writerTest();
        test.writeInFile();
    }


    public void readByChars() throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("For closing program input char '1'\nInput characters :");
        do{
            c = (char) br.read();
            System.out.println(c);
        }while(c != '1');
        br.close();
    }

    public void readByLines() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input lines of text");
        System.out.println("For closing program input line 'stop'");
        String str;
        do {
            str = br.readLine();
            System.out.println(str);
        }while(!str.equals("stop"));
        br.close();
    }

    public void readByLineAndSaveInArray() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("Input lines of text");
        System.out.println("For closing program input line 'stop'");
        for(int i = 0; i < 100; i++){
            str[i] = br.readLine();
            if(str[i].equals("stop")) break;
        }
        System.out.println("\nYour text is :");
        for(int i = 0; i < 100; i++){
            if(str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
        br.close();
    }

    public void writerTest(){
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Hello World");
        int i = 7;
        pw.println(i);
        pw.close();
    }

    public void writeInFile() throws FileNotFoundException {
        File file = new File("src/homework/lesson7/testFile");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Test row 1");
        pw.println("Test row 2");

        pw.close();
    }

}
