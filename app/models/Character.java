package models;

import java.util.List;
import play.db.ebean.Model;

public class Character extends Model{

  /**
   * 
   */
  private static final long serialVersionUID = 779310260480112020L;
  
  private String name;
  private int health;
  private int stun;
  private int fwdDash;
  private int bkDash;
  private int FADC1Fwd;
  private int FADC1Bk;
  private int FADC2Fwd;
  private int FADC2Bk;
  
  private List<Move> moves;
  
  public Character(String name, int health, int stun, int fwdDash, int bkDash, int FADC1Fwd, int FADC1Bk, 
      int FADC2Fwd, int FADC2Bk, List<Move> moves) {
    this.setName(name);
    this.setHealth(health);
    this.setStun(stun);
    this.setFwdDash(fwdDash);
    this.setBkDash(bkDash);
    this.setFADC1Fwd(FADC1Fwd);
    this.setFADC1Bk(FADC1Bk);
    this.setFADC2Fwd(FADC2Fwd);
    this.setFADC2Bk(FADC2Bk);
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the health
   */
  public int getHealth() {
    return health;
  }

  /**
   * @param health the health to set
   */
  public void setHealth(int health) {
    this.health = health;
  }

  /**
   * @return the stun
   */
  public int getStun() {
    return stun;
  }

  /**
   * @param stun the stun to set
   */
  public void setStun(int stun) {
    this.stun = stun;
  }

  /**
   * @return the fwdDash
   */
  public int getFwdDash() {
    return fwdDash;
  }

  /**
   * @param fwdDash the fwdDash to set
   */
  public void setFwdDash(int fwdDash) {
    this.fwdDash = fwdDash;
  }

  /**
   * @return the bkDash
   */
  public int getBkDash() {
    return bkDash;
  }

  /**
   * @param bkDash the bkDash to set
   */
  public void setBkDash(int bkDash) {
    this.bkDash = bkDash;
  }

  /**
   * @return the fADC1Fwd
   */
  public int getFADC1Fwd() {
    return FADC1Fwd;
  }

  /**
   * @param fADC1Fwd the fADC1Fwd to set
   */
  public void setFADC1Fwd(int fADC1Fwd) {
    FADC1Fwd = fADC1Fwd;
  }

  /**
   * @return the fADC1Bk
   */
  public int getFADC1Bk() {
    return FADC1Bk;
  }

  /**
   * @param fADC1Bk the fADC1Bk to set
   */
  public void setFADC1Bk(int fADC1Bk) {
    FADC1Bk = fADC1Bk;
  }

  /**
   * @return the fADC2Fwd
   */
  public int getFADC2Fwd() {
    return FADC2Fwd;
  }

  /**
   * @param fADC2Fwd the fADC2Fwd to set
   */
  public void setFADC2Fwd(int fADC2Fwd) {
    FADC2Fwd = fADC2Fwd;
  }

  /**
   * @return the fADC2Bk
   */
  public int getFADC2Bk() {
    return FADC2Bk;
  }

  /**
   * @param fADC2Bk the fADC2Bk to set
   */
  public void setFADC2Bk(int fADC2Bk) {
    FADC2Bk = fADC2Bk;
  }

  /**
   * @return the moves
   */
  public List<Move> getMoves() {
    return moves;
  }

  /**
   * @param moves the moves to set
   */
  public void setMoves(List<Move> moves) {
    this.moves = moves;
  }
}
