/**
 * @author ：chenxin
 * @date ：Created in 2020/4/11 14:50
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",soy";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.30;
    }
}
