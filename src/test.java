import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * meetod + return operaator
 * autor - Mihkel Kougia
 * ülesanne 6.4b
 * */
public class test {
    public static void main(String[] args) {
        ArrayList<Integer> mundid = new ArrayList<>();
        File fail = new File("C:\\Users\\mihkel\\IdeaProjects\\untitled\\src\\mündid.txt");
        Scanner input = null;
        try {
            input = new Scanner(fail);
        } catch (Exception e) {
            System.out.println("Faili pole - " + e.getMessage());
        }

        while (input.hasNextLine()) {
            Integer rida = input.nextInt();
            if (rida == 1 || rida == 2 || rida == 5) {
                mundid.add(rida);
            }

        }
        input.close();
        int sum = 0;
        for (int arv : mundid) {
            sum += arv;
        }

        System.out.println(mundid);
        System.out.println(sum);

    }
}