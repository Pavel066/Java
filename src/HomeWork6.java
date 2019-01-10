public class HomeWork6 {
        
    public static void main(String[] args) {
                       
      int i = 0;
      int j = 100;
                 
      Hero [] dcHeroes = new Hero[5];
      Hero [] marvelHeroes = new Hero[5];
      
        String [] dcNames = {"Tor", "Hren", "Pups", "Man", "Loh"};
        String [] marvelNames = {"Jim", "Sem", "Len", "Luk", "Nuf"};
        
      
        
      
        for (int h = 0; h < marvelHeroes.length; i++) {
            marvelHeroes[h] = new Hero();
            marvelHeroes[h].agility = getRandomNum(i, j);
            marvelHeroes[h].power = getRandomNum(i, j);
            marvelHeroes[h].weight = getRandomNum(i, j);
        }
        
        
         for (int h = 0; h < dcHeroes.length; i++) {
            dcHeroes[h] = new Hero();
            dcHeroes[h].agility = getRandomNum(i, j);
            dcHeroes[h].power = getRandomNum(i, j);
            dcHeroes[h].weight = getRandomNum(i, j);
        }
                             
                  
                
    }
        
    public static int getRandomNum(int i, int j){
        return i + (int) (Math.random() * j);
    }
    
    
}
