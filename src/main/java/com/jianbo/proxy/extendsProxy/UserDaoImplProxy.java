package com.jianbo.proxy.extendsProxy;

import com.jianbo.proxy.dao.UserDaoImpl;

public class UserDaoImplProxy extends UserDaoImpl {
    @Override
    public void query() {
        System.out.println("在目标方法前后执行增强");
        super.query();
        System.out.println("目标方法之后");
    }
}
