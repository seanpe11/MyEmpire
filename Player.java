import java.util.ArrayList;

public class Player{
  private int playerID;
  private String playerName;
  private double dCash;
  private ArrayList<Property> properties;
  //private ArrayList<Railroad> railroads;
  //private ArrayList<Utility>  utilities;
  //private ArrayList<Chance>   cards;
  private boolean isInJail;

  public void pay(double amount){
    dCash -= amount;
  }

  public Player(int playerID, String name){
    this.playerID = playerID;
    this.playerName = name;
    this.dCash = 1500;
  }

  public void buyProperty(Property toBuy){
    if (dCash >= toBuy.getBuyPrice()){
      properties.add(toBuy);
      dCash -= toBuy.buyProperty(this);
    }
  }

  public void passStart(){

  }
}
