package paymethod;

import java.util.HashMap;
import java.util.Map;

/**
 * 定义不同的支付策略
 * @author lp
 */
public class PayStrategy {
    public static final String ZHIFUBAO_PAY="ZHIFUBAO";
    public static final String WEIXIN_PAY="WEIXIN";
    public static final String UNION_PAY="UNION";
    public static final String DEFAULT_PAY=ZHIFUBAO_PAY;
    private static Map<String,PayAccess> payAccessMap=new HashMap<>();
    static {
        payAccessMap.put(ZHIFUBAO_PAY,new ZhifuBao());
        payAccessMap.put(WEIXIN_PAY,new Weixin());
        payAccessMap.put(UNION_PAY,new Union());
    }
    //通过key进行匹配不同的支付
    public static PayAccess get(String paykey){
        //如果你没有选择支付方式
        if(!payAccessMap.containsKey(paykey)){
            return payAccessMap.get(DEFAULT_PAY);
        }
        return payAccessMap.get(paykey);
    }
}
