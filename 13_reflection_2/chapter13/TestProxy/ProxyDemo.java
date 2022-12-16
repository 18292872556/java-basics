package chapter13.TestProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/12/16/23:12
 * @Description: 动态代理类
 */
public class ProxyDemo implements InvocationHandler {
    Object obj;//被代理的对象
    public ProxyDemo(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println(method.getName()+"方法开始执行");
        Object result = method.invoke(this.obj, args);//执行的是指定对象的指定的方法；传入参数调用该对象的该方法
        System.out.println(method.getName()+"方法执行完毕");
        return result;
    }
}
