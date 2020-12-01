package book.chapter02;

public class NoneDiscountPolicy extends DefaultDiscountPolicy {

  @Override
  protected Money getDiscountAmount(Screening screening) {
    return Money.ZERO;
  }
}
