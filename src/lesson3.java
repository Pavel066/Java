import java.util.Scanner;
public class lesson3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.println("Введите целое число: ");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            if (a%2 == 0){
                System.out.println("Число" + " " + a + " " + "чётное");
            }else {
                System.out.println("Вы ввели не чётное число");
            }
        }
    }
    
    
    
    
}

