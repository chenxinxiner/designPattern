/**
 * 单例模式，急切实例化
 *
 * @author ：chenxin
 * @date ：Created in 2020/4/11 18:33
 */
public class SingletonEager {
    private static SingletonEager uniqueInstance = new SingletonEager();

    public static SingletonEager getInstance() {
        return uniqueInstance;
    }
}
