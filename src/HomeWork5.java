public class HomeWork5 {
    
    public static void main(String[] args){
        int [][] Mas = new int[5][8];
        for(int i =0;i<Mas.length;i++){
            for(int j=0;j<Mas[i].length;j++){
                Mas[i][j]=(int)((Math.random()*199)-99);
                System.out.print(Mas[i][j]+" ");
            }
        }
        int min=Mas[0][0];
        for(int i =0;i<Mas.length;i++){
            for(int j=0;j<Mas[i].length;j++){
                if(Mas[i][j]>min)min=Mas[i][j];
            }
        }
        System.out.println(" ");
        System.out.println("Значение максимального элемента массива = "+min);
    }

    
}
