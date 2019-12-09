package promotion;

/**
 * 优惠活动
 * @author lp
 */
public class PromotionAction {
     //单例模式
    private PromotionStrategy promotionStrategy;
    public PromotionAction(PromotionStrategy promotionStrategy){
        this.promotionStrategy=promotionStrategy;
    }

    /**
     * 执行优惠的方法
     */
    public void execute(){
        promotionStrategy.doPromotion();
    }
}
