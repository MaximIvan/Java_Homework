import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task0 {

//Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
//Требуется перехватить все возможные ошибки и вывести их в логгер.
//
//После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате

    public static void main(String[] args) throws IOException {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число: ");
            byte num = in.nextByte();
            in.close();

            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/result.txt");
            File res = new File(pathFile);
            BufferedWriter writer = new BufferedWriter(new FileWriter(res, true));
            writer.write(Byte.toString(num));
            writer.newLine();
            writer.flush();

        } catch (Exception e) {
            Logger logger = Logger.getLogger(Task0.class.getName());
            FileHandler fh = new FileHandler("log.txt", true);
            logger.addHandler(fh);

            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);

            logger.info(e.toString());
        }
    }
}