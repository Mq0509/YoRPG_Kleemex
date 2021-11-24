public class Character{
  protected int _hitPts;
  protected int _strength;
  protected int _defense;
  protected double _attack;



  public boolean isAlive() {
    return _hitPts > 0;
  }
  public int getDefense() {
    return _defense;
  }
  public void lowerHP(int damageInflicted) {
    _hitPts -= damageInflicted;
  }
  public int attack(Character opponent) {
    int damage = (int)((_strength * _attack) - opponent.getDefense());
    return damage;
  }
}
