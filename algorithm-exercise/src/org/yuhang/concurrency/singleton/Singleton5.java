package org.yuhang.concurrency.singleton;

import org.yuhang.annotation.ThreadSafe;

/** 枚举构造单例类
 * Created by chinalife on 2018/5/24.
 */
@ThreadSafe
public class Singleton5 {

    private Singleton5(){

    }

    public static Singleton5 getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton{
        INSTANCE;

        private Singleton5 singleton;

        // JVM保证这个方法绝对只调用一次
        Singleton(){
            singleton = new Singleton5();
        }
        public Singleton5 getInstance(){
            return singleton;
        }
    }
}
