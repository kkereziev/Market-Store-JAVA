package com.PROGRAMISTA;

public class GoldenCard extends DiscountCard {

  private static double _discountRate;


  protected GoldenCard(String owner, double turnover) {
    super(owner, turnover);
    setDiscountRate(2.0);
  }

  @Override
  protected double getDiscountRate() {
    return this._discountRate;
  }

  @Override
  protected double setDiscountRate(double discountRate) {
    this._discountRate=discountRate;
    validate();
    return this._discountRate;
  }

  private void validate() {
    if (this.getTurnover() > 100)
    {
      this._discountRate += this.getTurnover() / 100;
      if (this._discountRate > 10)
      {
        this._discountRate = 10.0;
      }
    }
  }
}
