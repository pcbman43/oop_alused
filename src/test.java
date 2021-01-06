import java.util.Scanner;

/*
 * while tsükkel
 * autor - Mihkel Kougia
 * ülesanne 3.3
 */
public class test {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.print("Mitu pöialpoissi tahab õunu? ");
        int mitu = sisend.nextInt();
        int lumevalgekeseOunad = 14;
        int poialpoiss = 1;
        while (poialpoiss <= mitu) {
            int ounad = (int) (Math.random() * 3);
            System.out.println(ounad);
            lumevalgekeseOunad -= ounad;
            poialpoiss++;
        }
        System.out.println("Lumevalgekesele jäi " + lumevalgekeseOunad);
    }
}