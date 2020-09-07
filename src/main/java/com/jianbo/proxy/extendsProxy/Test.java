package com.jianbo.proxy.extendsProxy;

public class Test {
    public static void main(String[] args) {
        UserDaoImplProxy userDaoImplProxy = new UserDaoImplProxy();
        userDaoImplProxy.query();
    }
}
