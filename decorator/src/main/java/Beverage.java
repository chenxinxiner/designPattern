/**
 * 饮料类
 *
 * @author ：chenxin
 * @date ：Created in 2020/4/11 13:55
 */
public abstract class Beverage {
    String description = "UnKnow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
