package promotion;

/**
 * 优惠券策略
 * @author lp
 */
public class CouponStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券打折");
    }
}
