package paymethod;

/**
 * 定义支付方法调用
 */
public class Order {
    private String uid;
    private String orderid;
    private double amount;

    public Order(String uid, String orderid, double amount) {
        this.uid = uid;
        this.orderid = orderid;
        this.amount = amount;
    }
    //默认使用一个支付方法，如果没有选择
    public MsqResult pay(){
        return pay(PayStrategy.DEFAULT_PAY);
    }
    //自定义一个支付的方法
    //调用支付方式的时候传进去的参数是什么就根据这个参数匹配支付方式
    public MsqResult pay(String paykey){
        PayAccess payAccess=PayStrategy.get(paykey);
        System.out.println("欢迎使用"+payAccess.getName());
        System.out.println("本次交易金额为："+amount+",开始扣款...");
        return payAccess.pay(uid,amount);
    }
}
