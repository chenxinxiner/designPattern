/**
 * @author ：chenxin
 * @date ：Created in 2020/4/11 14:00
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
