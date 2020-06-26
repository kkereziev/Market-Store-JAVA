package com.PROGRAMISTA;

public class ProgramRun {

  public static void run() {
    var bronzeCard = new BronzeCard("Ivan", 0);
    var bronzeCardPurchase = 150;
    System.out.println(PayDesk.printCard(bronzeCard, bronzeCardPurchase));

    var silver = new SilverCard("Gosho", 600);
    var silverCardPurchase = 850;
    System.out.println(PayDesk.printCard(silver, silverCardPurchase));

    var gold = new GoldenCard("Pesho", 1500);
    var goldCardPurchase = 1300;
    System.out.println(PayDesk.printCard(gold, goldCardPurchase));
  }
}
