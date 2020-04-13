/**
 * 浓缩咖啡
 *
 * @author ：chenxin
 * @date ：Created in 2020/4/11 13:59
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
