import java.util.Scanner;

/*
 * meetod + return operaator
 * autor - Mihkel Kougia
 * ülesanne 6.2
 * */
public class test {
    static int mahlapakkideArv(double ounteKogus) {
        int pakkideArv = (int) Math.round(ounteKogus * 0.4 / 3);
        return pakkideArv;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sisestage õunte kogus kilogrammides: ");
        double mitu = input.nextDouble();

        System.out.println(mahlapakkideArv(mitu));

    }
}