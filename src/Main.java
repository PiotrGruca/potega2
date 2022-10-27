import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dalej=0;
        do {
            double licz = 1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj potege dwojki: ");
            int potega = sc.nextInt();
            int petlapotega = Math.abs(potega);
            if (potega == 0) {
                System.out.println("1");
            } else if (potega < 0) {
                for (int i = 0; i < petlapotega; i++) {
                    licz = licz / 2;
                    System.out.println((i+1)+ ". " + licz);
                }
            } else
                for (int i = 0; i < potega; i++) {
                    licz = licz * 2;
                    System.out.println((i+1)+ ". " + licz);
                }
                System.out.println("Czy chcesz zakończyć program? (1)");
                int podal = sc.nextInt();
                if(podal==1){
                    break;
                }
        } while (dalej==0);
    }
}