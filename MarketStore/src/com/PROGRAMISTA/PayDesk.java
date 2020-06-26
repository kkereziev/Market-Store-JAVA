package com.PROGRAMISTA;

import java.text.DecimalFormat;

public class PayDesk {



  public static String printCard(DiscountCard card, double purchaseValue) {
    var sb = new StringBuilder();
    sb.append("Purchase value: ").append("$"+String.format("%.2f", purchaseValue)+"\n");
    sb.append("Discount rate: ").append(String.format("%.1f",card.getDiscountRate())+"%\n");
    sb.append("Discount: ").append("$"+String.format("%.2f",card.discount(purchaseValue))+"\n");
    sb.append("Total: ").append("$"+String.format("%.2f",sumTotalPriceForPurchase(purchaseValue,card))+"\n");
    String result = sb.toString().trim();
    return result;
  }

  private static double sumTotalPriceForPurchase(double purchaseValue, DiscountCard card) {
    return Math.round(purchaseValue - card.discount(purchaseValue));
  }
}
