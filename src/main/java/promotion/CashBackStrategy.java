package promotion;

/**
 * 返现策略
 * @author lp
 */
public class CashBackStrategy implements PromotionStrategy {
    /**
     * 策略模式：算法家族里面有很多的算法，封装起来，让彼此之间可以相互交替使用，使用某一个
     * 算法的用户不会受到影响，为了减少各种算法类和使用算法类之间的耦合
     *
     * 策略模式的应用场景：一个系统中有很多的类，区别只是行为不同
     */
    @Override
    public void doPromotion() {
        System.out.println("返回现金到支付宝");

    }
}
