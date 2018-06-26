import java.util.Scanner;

/**
 * Created By Dark Sh@dow
 */
public class URI_1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass = 2002;
        int input = sc.nextInt();
        while(input != pass){
            System.out.println("Senha Invalida");
            input = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}
