import java.util.ArrayList;

public class TestDriver{
  public static void main(String[] args){
    String names[] = {
      "Almond Drive", "Kasoy Drive", "Rodeo Drive", "Orange Street", "Ventura Street", "Juan Luna", "Ylaya", "J. Abad Santos", "Madison",
      "Annapolis", "Conneticut", "Bougainvilla", "Dama de Noche", "Acacia", "Solar Street", "Galaxy Street", "9th Street", "5th Street",
    };

    String colors[] = {
      "grey", "grey", "purple", "purple", "purple", "pink", "pink", "pink", "green",
      "green", "green", "blue", "blue", "blue", "red", "red", "orange", "orange",
    };

    double buyPrices[] = {
      60.0, 60.0, 100.0, 100.0, 120.0, 140.0, 140.0, 160.0, 180.0, 180.0, 200.0, 220.0, 220.0, 240.0, 260.0, 260.0, 300.0, 320.0,
    };

    double upgradeCosts[] = {
      50.0, 50.0, 50.0, 50.0, 50.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 150.0, 150.0, 150.0, 150.0, 150.0, 200.0, 200.0,
    };

    double[][] RentLists= {
      {2, 10, 30, 90, 160, 250},
      {4, 20, 60, 180, 320, 450},
      {6, 30, 90, 270, 400, 550},
      {6, 30, 90, 270, 400, 550},
      {6, 40, 100, 300, 450, 600},
      {10, 50, 150, 450, 625, 750},
      {10, 50, 150, 450, 625, 750},
      {12, 60, 180, 500, 700, 900},
      {14, 70, 200, 550, 750, 950},
      {14, 70, 200, 550, 750, 950},
      {16, 80, 220, 600, 800, 1000},
      {18, 90, 250, 700, 875, 1050},
      {18, 90, 250, 700, 875, 1050},
      {20, 100, 300, 750, 925, 1000},
      {22, 110, 330, 800, 975, 1150},
      {22, 110, 330, 800, 975, 1150},
      {26, 130, 390, 900, 1100, 1275},
      {28, 150, 450, 1000, 1200, 1400},
    };

    double multipliers[] =
    {
      2.5, 3.0, 3.5, 4.0, 4.0, 4.5, 4.5, 5.0, 5.0, 5.5, 5.5, 6.0, 6.0, 6.5, 6.5, 7.0, 7.0, 8.0
    };

    ArrayList<Property> properties = new ArrayList<Property>();

    for (int i = 0; i<18;i++){
      Property bago = new Property(names[i], colors[i], buyPrices[i], upgradeCosts[i],RentLists[i], multipliers[i], 2);
      bago.debugPrint();
      properties.add(bago);
    }
  }
}
