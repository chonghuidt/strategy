package promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * 促销策略工厂
 * @author lp
 */
public class PromotionStrategyFactory {
    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP=new HashMap<>();

    static{
        //优惠券
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON,new CouponStrategy());
        //返现
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK,new CashBackStrategy());
        //团购
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUY,new GroupBuyStragety());
    }
    //实例化一个没有打折的情况
    private static final PromotionStrategy NON_PROMOTION=new EmptyStrategy();
    //构造
    private  PromotionStrategyFactory(){}
    //根据对应的key值，实例化不同的策略
    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy=PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy==null?NON_PROMOTION:promotionStrategy;
    }
    //定义接口常量，可以用枚举比较推荐
    private interface PromotionKey{
        String COUPON="COUPON";
        String CASHBACK="CASHBACK";
        String GROUPBUY="GROUPBUY";
    }
}
