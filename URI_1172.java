import java.util.Scanner;

/**
 * Created By Dark Sh@dow
 */
public class URI_1172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x[] = new int[10];
        for (int i = 0; i < 10 ; i++) {
            int temp = sc.nextInt();
            if (temp>0){
                x[i] = temp;
            }else{
                x[i] = 1;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("X["+i+"] = "+x[i]);
        }

    }
}
