package web.tools;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * shiro 自定义的安全域
 * Created by huxingyue on 2017/9/8.
 */
public class MyRealm1 implements Realm {
    @Override
    public String getName() {
        return "myrealm1";
    }

    @Override
    public boolean supports(AuthenticationToken authenticationToken) {
        //仅支持UsernamePasswordToken类型的Token
        return authenticationToken instanceof UsernamePasswordToken;
    }

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal();  //得到用户名
        String password = new String((char[]) authenticationToken.getCredentials()); //得到密码
        if (!"zhang".equals(username)) {
            throw new UnknownAccountException("用户名无效"); //如果用户名错误
        }
        if (!"123".equals(password)) {
            throw new IncorrectCredentialsException("密码无效"); //如果密码错误
        }
        //如果身份认证验证成功，返回一个AuthenticationInfo实现；
        return new SimpleAuthenticationInfo(username, password, getName());
    }
}
