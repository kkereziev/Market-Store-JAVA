package com.PROGRAMISTA;

public class SilverCard extends DiscountCard {

  private static double _discountRate;

  protected SilverCard(String owner, double turnover) {
    super(owner, turnover);
    setDiscountRate(2.0);
  }

  @Override
  protected double getDiscountRate() {
    return this._discountRate;
  }

  @Override
  protected double setDiscountRate(double discountRate) {
    this._discountRate = discountRate;
    validate();
    return this._discountRate;
  }

  private void validate() {
    if (this.getTurnover() > 300)
    {
      this._discountRate = 3.5;
    }
  }
}
