public class Warrior extends Protagonist {

    public Warrior (){
      _strength = 120;
    }

    public Warrior (String name) {
      super(name);
      _strength = 120;
    }
    public static String about(){
    return "Warriors have greater offense.";
  }
}
