package paymethod;

/**
 * 支付通道
 * @author lp
 */
public abstract class PayAccess {
    //支付类型的抽象方法
    public abstract String getName();
    //查询余额的抽象方法
    protected  abstract  double queryBlance(String uid);

    //扣款支付  MsqResult:返回值类型，说明是我们自定义的类（类里面属性有：支付状态，详情，余额）
    public MsqResult pay(String uid,double amount){
        //如果你的支付方式里面的余额，支付宝里面只有500块钱，amount商品额价格
        if(queryBlance(uid)<amount){
            return  new MsqResult(500,"支付失败","余额不足");
        }
        return  new MsqResult(200,"支付成功","支付金额:"+amount);
    }

}
