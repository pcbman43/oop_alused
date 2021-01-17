import java.util.Scanner;

/*
 * meetod + return operaator
 * autor - Mihkel Kougia
 * ülesanne 6.4
 * */
public class test {
    public static void tervitus(int n) {
        System.out.println("\"Tere!\"");
        System.out.println("Täna " + n + ". kord tervitada mõtiskleb võõrustaja.");
        System.out.println("\"Külaline: Tere, suur tänu kutse eest!\"");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sisestage külaliste arv: ");
        int mitu = input.nextInt();

        int number = 1;

        while (number <= mitu) {
            tervitus(number);
            number++;
        }
    }
}