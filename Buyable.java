public class Buyable{
  /**
  Owner of the tile
  @author Sean Pe 11828900 and Chuan-Chen
  @author sean_pe@dlsu.edu.ph

  */

  protected Player owner;

  /**
    Buyable tile constructor method. No params needed (will mostly use constructors in subclasses)
  */
  public Buyable(){

  }

  /**
    Sets the owner of the tile.
    @param newOwner the new owner of the tile.
  */
  public void setOwner(Player newOwner){
    owner = newOwner;
  }
}
