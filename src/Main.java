import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dalej=0;
        do {
            float licz = 1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj potege dwojki: ");
            int potega = sc.nextInt();
            int petlapotega = Math.abs(potega);
            if (potega == 0) {
                System.out.println("1");
            } else if (potega < 0) {
                for (int i = 0; i < petlapotega; i++) {
                    licz = licz / 2;
                    System.out.println(i + ". " + licz);
                }
            } else
                for (int i = 0; i < potega; i++) {
                    licz = licz * 2;
                    System.out.println(i + ". " + licz);
                }
                System.out.println("Czy chcesz wyjsc z programu? (1)");
                int podal = sc.nextInt();
                System.out.println("PODALES: "+podal);
                if(podal==1){
                    break;
                }
        } while (dalej==0);
    }
}