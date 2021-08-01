import java.util.Random;
import java.util.Scanner;
public class sps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("welcome to \n STONE PAPER SCISSOR game");
        System.out.println("enter your name");
        String name = sc.nextLine();
        int ptc=0;
        int ptu=0;
        int i = 1;
        while (i < 4) {

            int comp = rn.nextInt(3);
        System.out.println("enter your choice \n 1 for STONE \n 2 for PAPER \n 3 for SCISSOR");
        int ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    if (comp == 2){ System.out.println("computer WON "+name+" LOSE");
                    ptc++; }
                    else { System.out.println(name+" WON computer LOSE");
                    ptu++; }
                }
                case 2 -> {
                    if (comp == 3) { System.out.println("computer WON "+name+" LOSE");
                    ptc++; }
                    else { System.out.println(name+" WON computer LOSE");
                    ptu++; }
                }
                case 3 -> {
                    if (comp == 1) { System.out.println("computer WON "+name+" LOSE");
                    ptc++; }
                    else { System.out.println(name+" WON computer LOSE");
                    ptu++; }
                }
                default -> System.out.println("invalid choice");
            }
            i++;

        }
        System.out.println("final result:");
        if (ptc>ptu)
            System.out.println("COMPUTER WON");
        else System.out.println(name+" WON");
        System.out.println("computer score:"+ptc);
        System.out.println(name+" score:"+ptu);
    }

}
