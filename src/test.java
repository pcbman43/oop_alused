import java.util.Scanner;

/*
 * meetod + return operaator
 * autor - Mihkel Kougia
 * ülesanne 6.3
 * */
public class test {
    static int eelarve(int mitu) {
        int makse = mitu * 10 + 55;
        return makse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mitu inimest on kutsutud?");
        int kutsutud = input.nextInt();
        System.out.println("Mitu inimest tuleb?");
        int tulevad = input.nextInt();

        System.out.println("Maksimaalne eelarve: " + eelarve(kutsutud) + " eurot.");
        System.out.println("Minimaalne eelarve: " + eelarve(tulevad) + " eurot.");
    }
}