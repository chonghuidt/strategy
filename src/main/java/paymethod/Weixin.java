package paymethod;

/**
 * 微信支付
 * @author lp
 */
public class Weixin extends PayAccess {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
        protected double queryBlance(String uid) {
            return 500;
    }
}
