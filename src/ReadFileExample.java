import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Sum= " +sum);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            System.out.println(file.exists());
            System.out.println(file.getAbsolutePath());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            FileWriter writer = new FileWriter("test.txt");
            writer.write("10"+"\n");
            writer.write("10");
            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Enter file path");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
