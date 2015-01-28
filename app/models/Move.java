package models;

import play.db.ebean.Model;

public class Move extends Model{

  /**
   * 
   */
  private static final long serialVersionUID = -8341532441712105956L;
  
  private String moveName;
  private int damage;
  private int startUp;
  private int active;
  private int recovery;
  private int onBlock;
  private int onHit;
  
  public Move(String moveName, int damage, int startUp, int active, int recovery, int onBlock, int onHit) {
    this.setMoveName(moveName);
    this.setDamage(damage);
    this.setStartUp(startUp);
    this.setActive(active);
    this.setRecovery(recovery);
    this.setOnBlock(onBlock);
    this.setOnHit(onHit);
  }
  /**
   * @return the moveName
   */
  public String getMoveName() {
    return moveName;
  }
  /**
   * @param moveName the moveName to set
   */
  public void setMoveName(String moveName) {
    this.moveName = moveName;
  }
  /**
   * @return the damage
   */
  public int getDamage() {
    return damage;
  }
  /**
   * @param damage the damage to set
   */
  public void setDamage(int damage) {
    this.damage = damage;
  }
  /**
   * @return the startUp
   */
  public int getStartUp() {
    return startUp;
  }
  /**
   * @param startUp the startUp to set
   */
  public void setStartUp(int startUp) {
    this.startUp = startUp;
  }
  /**
   * @return the active
   */
  public int getActive() {
    return active;
  }
  /**
   * @param active the active to set
   */
  public void setActive(int active) {
    this.active = active;
  }
  /**
   * @return the recovery
   */
  public int getRecovery() {
    return recovery;
  }
  /**
   * @param recovery the recovery to set
   */
  public void setRecovery(int recovery) {
    this.recovery = recovery;
  }
  /**
   * @return the onBlock
   */
  public int getOnBlock() {
    return onBlock;
  }
  /**
   * @param onBlock the onBlock to set
   */
  public void setOnBlock(int onBlock) {
    this.onBlock = onBlock;
  }
  /**
   * @return the onHit
   */
  public int getOnHit() {
    return onHit;
  }
  /**
   * @param onHit the onHit to set
   */
  public void setOnHit(int onHit) {
    this.onHit = onHit;
  }

}
