package com.gengsc.test;

import com.gengsc.user.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @Description
 * @Author shichaogeng
 * @Create 2018-01-03 10:48
 */
public class ConsumerTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("consumer-context.xml");

        app.start();

        UserService userservice = app.getBean(UserService.class);
        Object user = userservice.getUser("001");
        System.out.println(user);
    }

    @Test
    public void demo1() {
        Object proxy = null;
        try {
            proxy = Proxy
                    .newProxyInstance(
                            this.getClass().getClassLoader(),
                            new Class<?>[]{Class.forName("com.gengsc.user.service.UserService")}, new InvocationHandler() {
                                @Override
                                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                                    return null;
                                }
                            });
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(proxy);
    }

}
