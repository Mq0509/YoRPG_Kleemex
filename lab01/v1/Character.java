public class Character{
  private int _hitPts;
  private int _strength;
  private int _defense;
  private double _attack;

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
