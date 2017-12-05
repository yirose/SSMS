package com.yi.Controller.realms;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.Realm;

public class shiroRealm extends AuthenticatingRealm {

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {

		//1：把AuthenticationToken 转换为 UsernamePasswordToken;
		UsernamePasswordToken upToken =(UsernamePasswordToken) token;
		
		//2：从UsernamePasswordToken 中获取username;		
		String username = upToken.getUsername();
		
		//3：调用数据库的方法，从数据库中查询username的对应记录；
		System.out.println("从数据库中获取username："+username+" 的对应记录");
		//4：若用户不存在，则抛出 UnknownAccountException 异常；
		if("unknown".equals(username)){
			throw new UnknownAccountException("用户不存在！");			
		}
		//5：根据用户信息，决定是否需要抛出其它的 AuthenticationException 异常；
		if("monster".equals(username)){
			throw new LockedAccountException("用户被锁定！");			
		}		
		//6：根据用户的情况，来构建AuthenticationInfo对象并返回。通常使用的实现类SimpleAuthenticationInfo
		// 一下信息是从数据库中获取
		//1:  principal 认证实体信息，可以使用户（帐号）信息，也可以使数据表对应的用户的实体信息。
		Object principal = username;
		
		//2: credentials 密码
		Object credentials = "123456";
		
		//3: realmName 当前realm的对象的name 调用父类的getName() 方法即可。
		String realmName = getName();
		
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, credentials, realmName);
		return info;
	}
}