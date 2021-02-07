import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * meetod + return operaator
 * autor - Mihkel Kougia
 * ülesanne 5.4c
 * */
public class test {
    public static void main(String[] args) {
        ArrayList<String> opilased = new ArrayList<>();
        File fail = new File("C:\\Users\\mihkel\\IdeaProjects\\untitled\\src\\nimekiri.txt");
        Scanner input = null;
        try {
            input = new Scanner(fail);
        } catch (Exception e) {
            System.out.println("Faili pole - " + e.getMessage());
        }

        while (input.hasNextLine()) {
            String rida = input.nextLine();
            opilased.add(rida);
        }
        input.close();

        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter todayFormat = DateTimeFormatter.ofPattern("dd");
        String todayFormatted = today.format(todayFormat);
        System.out.println(todayFormatted);
        int index = Integer.parseInt(todayFormatted);
        System.out.println(opilased.get(index - 1));


    }
}