package com.pursuit.designmodel.proxy.easy.cglib;
import com.pursuit.designmodel.proxy.easy.DBQuery;
import com.pursuit.designmodel.proxy.easy.IDBQuery;

public class CglibProxyMain {
	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
//		IDBQuery query = (IDBQuery) proxy.createProxy1(DBQuery.class);
		IDBQuery query = (IDBQuery) proxy.createProxy2();
		query.request();
	}

}
