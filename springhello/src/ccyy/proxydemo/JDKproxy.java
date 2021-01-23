package ccyy.proxydemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKproxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
       UserDao userDaoproxy = (UserDao) Proxy.newProxyInstance(JDKproxy.class.getClassLoader(),interfaces,new UserDaoProxy(new UserDaoImpl()));
       int result = userDaoproxy.add(1,2);
        System.out.println(result);
    }
}
class UserDaoProxy implements InvocationHandler{
    private Object obj;
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法执行前");
        Object res = method.invoke(obj,args);
        System.out.println(res);
        System.out.println("方法执行后");
        return res;
    }
}