package paymethod;

/**
 * 银联支付
 * @author lp
 */
public class Union extends PayAccess {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
        protected double queryBlance(String uid) {
            return 300;
    }
}
