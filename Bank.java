public class Bank{
  private double cash;

  public Bank(int nPlayers){
    cash = nPlayers * 2500;
  }

  public void addCash(int nAmount){
    cash -= nAmount;
  }

  public boolean deductCash(int nAmount){ // returns false if bank does not have enough money to pay player, ending game
    cash -= nAmount;
    if (cash >= 0)
      return false;
    return true;
  }
}
