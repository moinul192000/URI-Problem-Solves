import java.util.Scanner;

/**
 * Created By Dark Sh@dow
 */
public class URI_1175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N[] = new int[20];
        for (int i = 0; i < N.length ; i++) {
            N[i] = sc.nextInt();
        }

        for (int i = 0; i < (N.length/2); i++) {
            int temp = N[i];
            N[i] = N[N.length-(i+1)];
            N[N.length-(i+1)]=temp;
        }

        for (int i = 0; i <N.length ; i++) {
            System.out.println("N["+i+"] = "+N[i]);
        }
    }
}
