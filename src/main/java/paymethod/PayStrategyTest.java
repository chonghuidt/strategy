package paymethod;

/**
 * 测试类
 * @author lp
 */
public class PayStrategyTest {
    public static void main(String[] args) {
        //省略了其他步骤，直接开始付款
        Order order=new Order("1","20190821",500);
        //支付的时候决定了使用哪一个
        System.out.println(order.pay(PayStrategy.UNION_PAY));
    }
}
