public class Protagonist extends Character{
 public String name;
  public Protagonist(String llamar){
    name=llamar;
  }
  public boolean isAlive(){
    return true;
  }
  public void specialize(){

  }
  public void normalize(){

  }
  public int attack(Monster a){
    return 0;
  }
  public String getName(){
    return name;
  }
}
