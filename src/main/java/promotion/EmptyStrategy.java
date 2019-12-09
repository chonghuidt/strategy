package promotion;

/**
 * 没有任何优惠
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("没有优惠");

    }
}
