package com.chulung.dp.singleton;

/**
 * Created by chulung on 2017/9/26.
 */
public class DoubleCheckSingleton {
    /**
     * volatile 禁止重排序，保证happen-before
     */
    private static volatile DoubleCheckSingleton instance;

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

}
