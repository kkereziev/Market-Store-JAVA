package com.PROGRAMISTA;

import java.text.DecimalFormat;

public abstract class DiscountCard {

  private static DecimalFormat df2 = new DecimalFormat("0.00");
  private final String _owner;
  private final double _turnover;

  protected DiscountCard(String owner, double turnover) {
    this._owner = owner;
    this._turnover = turnover;
  }

  public String getOwner() {
    return _owner;
  }

  public double getTurnover() {
    return _turnover;
  }

  protected abstract double getDiscountRate();

  protected abstract double setDiscountRate(double discountRate);

  public double discount(double purchaseValue) {
    var result = purchaseValue * (this.getDiscountRate() / 100);
    return result;
  }
}
