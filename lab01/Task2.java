import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        while (time <= 0) {
            time = scan.nextInt();
        }

        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;

        System.out.println("Time is: " + hours + ":" + minutes + ":" + seconds);
        
        scan.close();
    }
}
