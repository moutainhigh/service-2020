package ytb.common.context.model;


import ytb.common.utils.YtbUtils;
import ytb.common.ytblog.YtbLog;
import java.math.BigDecimal;

public class Ytb_Model {
    protected BigDecimal newBigDecimal(float value) {
        return new BigDecimal(value).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    BigDecimal newBigDecimal(double value) {
        return new BigDecimal(value).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    BigDecimal newBigDecimal(int value) {
        return new BigDecimal(value).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public String toString(){
        return YtbUtils.toJSONStringPretty(this);

    }

    public void log(String title) {
        YtbLog.logDebug(title, this);
    }

    public void log() {
        YtbLog.logDebug(this.getClass().getName(), this);
    }
}
