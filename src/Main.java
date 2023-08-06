import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            File file = new File("newFile.txt");
            if (!file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            pw.println("Everything is working.");
            pw.println("Hello word!!");
            pw.close();

            br = new BufferedReader(new FileReader("newFile.txt"));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Error" + e);
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error" + e);
            }
        }


    }
}