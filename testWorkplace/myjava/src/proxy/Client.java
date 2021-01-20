package proxy;

import cglib.TeacherDao;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeacherDao target = new TeacherDao();
		
		ProxyFactor proxyFactor = new ProxyFactor(target);
		
		ITeacherDao pObject = (ITeacherDao) proxyFactor.getProxyInstance();
		
		pObject.teache();
	}

}
