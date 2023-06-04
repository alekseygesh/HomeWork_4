import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число и нажмите Enter: ");
        int x = Integer.parseInt(buffer.readLine());

        System.out.println("Введите второе число и нажмите Enter: ");
        int y = Integer.parseInt(buffer.readLine());

        System.out.println("Введите третье число и нажмите Enter: ");
        int z = Integer.parseInt(buffer.readLine());

        int srArifm = (x + y + z)/3;
        double srArifm2 = Math.floor((double) srArifm/2);

        System.out.println("Среднее арифмитическое: " + srArifm);
        System.out.println("Значение, от деления на два: " + srArifm2);

        if(srArifm2 > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}