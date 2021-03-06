package strategy;

import org.springframework.stereotype.Component;
import strategy.annotation.StrateGyAnnotation;
import strategy.constants.StageConstants;
import strategy.inter.StrategyInterface;

import java.math.BigDecimal;

/**
 * <pre>
 *     两点double数相加类
 * </pre>
 *
 * @author shidijian@ycs168.cn
 * @version 1.00.00
 * @Date 2019-11-22 12:03
 */
@StrateGyAnnotation(StageConstants.STAGE_ADD)
@Component
public class AddStage implements StrategyInterface {
    public double calcul(double d1, double d2) {
        BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.add(bd2).doubleValue();
    }
}
