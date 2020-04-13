import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author ：chenxin
 * @date ：Created in 2020/4/11 14:06
 */
public class App {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + "$" + espresso.cost());
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        System.out.println(houseBlend.getDescription() + "$" + houseBlend.cost());

        HashMap<Object, Object> objectObjectHashMap = new HashMap<Object, Object>();
        objectObjectHashMap.put("S", "s");
        Iterator<Map.Entry<Object, Object>> iterator = objectObjectHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Object, Object> next = iterator.next();
            System.out.println(next.getKey() + " ---- value ---" + next.getValue());
        }

        objectObjectHashMap.forEach((key, value) -> System.out.println(key + "  " + value));
    }
}
