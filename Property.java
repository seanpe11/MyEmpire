import java.util.ArrayList;

public class Property extends Buyable{
  private String strPropertyName;
  private String color;
  private double dBuyPrice;
  private int nHouses; //also used as index for rentTiers
  private double rentTiers[] = new double[3];
  private double dRentMultiplier;
  private int nFootTraffic;
  private int nFootTrafficLimit;

  public Property(String name, String color, double dBuyPrice, double[] rentTiers, double dRentMultiplier, int nFootTrafficLimit){
    this.strPropertyName = name;
    this.Color = color;
    this.rentTiers = rentTiers;
    this.nHouses = 0;
    this.dRentMultiplier = dRentMultiplier;
    nFootTraffic = 0;
    this.nFootTrafficLimit = nFootTrafficLimit;
  }
  public getBuyPrice(){
    return nBuyPrice;
  }

}
