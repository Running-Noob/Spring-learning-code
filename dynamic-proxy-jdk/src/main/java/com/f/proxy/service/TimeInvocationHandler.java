package com.f.proxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 专门负责计时的调用处理器对象
 * 在这个调用处理器中，负责编写计时相关的增强代码。
 *
 * @author fzy
 * @date 2024/1/24 20:36
 */
public class TimeInvocationHandler implements InvocationHandler {
    // 目标对象
    private Object target;

    public TimeInvocationHandler(Object target) {
        // 将目标对象赋值给成员变量
        this.target = target;
    }

    /**
     * 1. 为什么强行要求你必须实现InvocationHandler接口？
     *      因为一个类实现接口就必须实现接口中的方法。
     *      以下这个方法的方法名为invoke，因为JDK在底层调用invoke方法的程序已经提前写好了
     *      注意：invoke方法不是我们程序员负责调用的，JDK负责调用。
     * 2. invoke方法什么时候被调用？
     *      当代理对象调用代理方法的时候，注册在InvocationHandler调用处理器中的invoke方法被调用
     * 3. invoke方法的三个参数：
     *      invoke方法是JDK负责调用的，所以JDK调用这个方法的时候会自动给我们传过来这三个参数。
     *      我们可以在invoke的方法体中直接使用这三个参数。
     *      第一个参数：Object proxy
     *          代理对象的引用。
     *          这个参数使用较少
     *      第二个参数：Method method
     *          目标对象的目标方法（要执行的目标方法）
     *      第三个参数：Object[] args
     *          目标方法的实参
     *     invoke方法在执行过程中，使用method来调用目标对象的目标方法
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long begin = System.currentTimeMillis();
        // 注意：调用代理对象的代理方法的时候，目标对象的目标方法得保证执行。
        Object retValue = method.invoke(target, args);
        long end = System.currentTimeMillis();
        System.out.println("该业务耗时 " + (end - begin) + " 毫秒");
        // 如果代理对象调用代理方法之后，需要返回结果的话，invoke方法必须将目标对象的目标方法的执行结果继续返回
        return retValue;
    }
}
