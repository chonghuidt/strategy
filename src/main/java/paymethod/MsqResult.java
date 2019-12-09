package paymethod;

/**
 * 支付完成以后的状态
 * @author lp
 */
public class MsqResult {
    private int code;      //支付状态
    private Object data;   //余额
    private String msg;     //交易详情

    public MsqResult(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return ("支付状态：["+code+"],"+msg+",交易详情:"+data);
    }
}
