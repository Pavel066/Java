
public class HomeWork4 {

    public static void main(String[] args) {

        int[][] Mas = new int[5][8];
        for (int i = 0; i < Mas.length; i++) {
            for (int j = 0; j < Mas[i].length; j++) {
                Mas[i][j] = (int) (Math.random() * 90) + 10;
                System.out.print(Mas[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}
