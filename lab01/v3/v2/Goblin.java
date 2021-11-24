public class Goblin extends Monster {
    private int _strength= 30 + (int)( Math.random() * 45 );;
    public static String about(){
      return "Goblins have higher attack.";
    }
}
