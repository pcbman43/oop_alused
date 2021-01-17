import java.util.Scanner;

/*
 * meetod + return operaator
 * autor - Mihkel Kougia
 * ülesanne 6.1
 * */
public class test {
    static String banner(String lause) {
        String suur = lause.toUpperCase();
        return suur;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mitu korda kuvada soovite reklaamilauset kuvada? ");
        int mitu = input.nextInt();
        System.out.println("Sisestage reklaamlause: ");
        input = new Scanner(System.in);
        String mis = input.nextLine();
        int kord = 1;
        while (kord <= mitu) {
            System.out.println(banner(mis));
            kord++;
        }
    }
}