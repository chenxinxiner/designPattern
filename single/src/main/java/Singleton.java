/**
 * 单例模式（双重检查加锁，在getInstance中减少使用同步）
 *
 * @author ：chenxin
 * @date ：Created in 2020/4/11 18:31
 */
public class Singleton {

    private volatile static Singleton uniqueInstance;

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

}
