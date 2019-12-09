package paymethod;

/**
 * 支付宝支付
 * @author lp
 */
public class ZhifuBao extends PayAccess {
    @Override
    //通过哪种方式付款
    public String getName() {
        return "支付宝";
    }

    @Override
    //模拟支付宝账号有900块钱
    protected double queryBlance(String uid) {
        return 900;
    }
}
