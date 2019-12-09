package promotion;

import org.apache.commons.lang3.StringUtils;

/**
 * 测试促销策略
 * @author lp
 */
public class PromotionActionTest {
    /**
     *
     * 第一次测试
     */
//    public static void main(String[] args) {
//        //模拟双十一打折
//        PromotionAction action1111=new PromotionAction(new GroupBuyStragety());
//        //模拟618打折
//        PromotionAction action618=new PromotionAction(new CouponStrategy());
//        action1111.execute();
//        action618.execute();
//        //如果后期增加许多功能，作为程序编写人员，业务增加比较繁琐
//        //如何进行优化？？
//
//
//    }

    /**
     *
     * 简单优化后测试
     */
//    public static void main(String[] args) {
//        //定义一个对象
//        PromotionAction promotionAction=null;
//        //定义优惠的key，这里是优惠券
//        String promotionKey="COUPON";
//        //如果匹配的是优惠券，那就实例化优惠券的策略
//        if(StringUtils.equals(promotionKey,"COUPON")){
//            promotionAction=new PromotionAction(new CouponStrategy());
//        //如果是返现，实例化就是返现策略
//        }else if(StringUtils.equals(promotionKey,"CASHBACK")){
//            promotionAction=new PromotionAction(new CashBackStrategy());
//        }//。。。。不管后面有多少都是else if
//        promotionAction.execute();
//
//    }
    public static void main(String[] args) {
        //策略模式=单例+工厂
        String promotionKey="COUPON";
        PromotionAction promotionAction=new PromotionAction(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionAction.execute();
    }

}
