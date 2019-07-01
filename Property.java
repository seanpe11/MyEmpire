import java.util.ArrayList;

public class Property extends Buyable{
  private String strPropertyName;
  private String color;
  private double dBuyPrice;
  private int nHouses; //also used as index for rentTiers
  private double rentTiers[] = new double[6];
  private double dDevelopCost;
  private double dCollected;
  private double dFootMultiplier;
  private int nFootTraffic;
  private int nFootTrafficLimit;


  public Property(String name, String color, double dBuyPrice, double dDevelopCost, double[] rentTiers, double dFootMultiplier, int nPlayers){
    this.strPropertyName = name;
    this.color = color;
    this.dBuyPrice = dBuyPrice;
    this.dDevelopCost = dDevelopCost;
    this.nHouses = 0;
    this.rentTiers = rentTiers;
    this.dCollected = 0;
    this.dFootMultiplier = dFootMultiplier;
    this.nFootTraffic = 0;
  }

  public String getName(){
    return strPropertyName;
  }

  public String getColor(){
    return color;
  }

  public double getBuyPrice(){
    return dBuyPrice;
  }

  public double getDevelopCost(){
    return dDevelopCost;
  }

  public int getHouses(){
    return nHouses;
  }

  public void develop(){
    nHouses += 1;
  }
  
  /**
    adds 1 to nHouses when player decides to develop on int
    nhouse = 1, player chose to develop, nhouse = 2
    nhouse = 0, player chose to develop, nhouse = 1
    nhouse = 2, player chose to develop, nhouse = 3
    No params needed (will mostly use constructors in subclasses)
  */

  public double getRent(){
    return rentTiers[nHouses];
  }

  public void increaseRent(){
    for (int i = 0; i<5 ; i++){
      rentTiers[i] += 10;
    }
  }
/**
    add the rent when property owns have same color with other property owned. 
      Almond Drive = 2 when kasoy Street is bought Almond Drive = 12
      Solar Street = 22 when Galaxy Street is bought Solar Street = 22
      Juan Luna = 10 when Ylaya is bought Juan Luna = 20
      
    No params needed (will mostly use constructors in subclasses)
  */
  public int getFootLimit(){
    return nFootTrafficLimit;
  }

  public void playerLanded(){
    nFootTraffic += 1;
  }
  /**
    tracks the number of player landed on a specific area 
      when a player is on Juan Luna nFootTraffic = 1 
      when another player lands nFootTraffic = 2
      when another player lands nFootTraffic = 3
    No params needed (will mostly use constructors in subclasses)
  */

  public double buyProperty(Player buyer){
    this.owner = buyer;
    return dBuyPrice;
  }
   /**
    tracks the footTraffic 
      when a player is on Juan Luna nFootTraffic = 1 
      when another player lands nFootTraffic = 2
      when another player lands nFootTraffic = 3
    No params needed (will mostly use constructors in subclasses)
  */

  public double collectRent(){
    dCollected = rentTiers[nHouses];
    return rentTiers[nHouses];
  }
   /**
    Collects rent base from the property and the level
      player1 steps on Madison unimporved owned by player 2 pays 14
      player1 steps on 9th Street unimporved owned by player 2 pays 26
      player1 steps on 5th avenue unimporved owned by player 2 pays 28
      
    No params needed (will mostly use constructors in subclasses)
  */

  public void debugPrint(){ //FOR DEBUGGING PURPOSES ONLY
    System.out.println("" + this.strPropertyName + " " + this.color + " " + this.dBuyPrice + " " + this.dDevelopCost  + " " + this.rentTiers[nHouses] + " " +  this.dFootMultiplier);
  }
  /**
    debugging purposes
     Almond Drive grey 60 50 1 2.5
     Rodeo Drive Purple 100 50 2 3.5
     Juan Luna Pink 140 100 2 4.5
    No params needed (will mostly use constructors in subclasses)
  */

}

