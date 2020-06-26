package com.PROGRAMISTA;

public class BronzeCard extends DiscountCard {

  private static double _discountRate;

  protected BronzeCard(String owner, double turnover) {
    super(owner, turnover);
    setDiscountRate(0.0);
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
    if (this.getTurnover() >= 100 && this.getTurnover() <= 300) {
      this._discountRate = 1.0;
    } else if (this.getTurnover() > 300) {
      this._discountRate = 2.5;
    }
  }
}
