package com.f.proxy.client;

import com.f.proxy.service.OrderService;
import com.f.proxy.service.OrderServiceImpl;
import com.f.proxy.service.TimeInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * 客户端程序
 *
 * @author fzy
 * @date 2024/1/24 20:19
 */
public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        OrderService target = new OrderServiceImpl();
        // 创建代理对象(使用JDK动态代理)
        /**
         * 1. newProxyInstance 翻译为：新建代理对象
         *      通过调用这个方法可以创建代理对象
         *      本质上，这个Proxy.newProxyInstance方法的执行做了两件事：
         *          第一件事：在内存中动态生成了一个代理类的字节码class
         *          第二件事：通过内存中生成的代理类，实例化了代理对象并返回
         * 2. 关于newProxyInstance方法的三个重要参数，每一个什么含义，有什么用？
         *      第一个参数 ClassLoader loader
         *          类加载器。
         *          在内存中生成的字节码也是class文件，要执行也得先加载到内存当中。
         *          加载类就需要使用类加载器，所以这里需要指定类加载器。
         *          并且JDK要求，代理类的类加载器必须和目标类的类加载器使用同一个。
         *      第二个参数 Class<?>[] interfaces
         *          代理类和目标类实现的同一个或同一些接口。
         *      第三个参数 InvocationHandler h
         *          调用处理器。
         *          在调用处理器接口中，编写的就是增强代码。
         *          因为具体要添加什么增强代码，需要我们自己写。
         *          既然是接口，就要写接口的实现类
         * 注意：代理对象和目标对象实现的接口一样，所以可以向下转型。
         */
        //Object obj = Proxy.newProxyInstance(类加载器, 代理类要实现的接口, 调用处理器);
        OrderService proxy = (OrderService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new TimeInvocationHandler(target));
        // 调用代理对象的代理方法
        proxy.generate();
        proxy.modify();
        proxy.detail();
    }
}
