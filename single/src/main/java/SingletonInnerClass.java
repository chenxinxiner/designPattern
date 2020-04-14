/**
 * 内部类实现单例模式
 *
 * @author ：chenxin
 * @date ：Created in 2020/4/14 22:34
 */
public class SingletonInnerClass {

    private SingletonInnerClass() {

    }

    private static class Inner {
        private static SingletonInnerClass singletonInnerClass = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance() {
        return Inner.singletonInnerClass;
    }
}
