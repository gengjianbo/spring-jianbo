package com.jianbo.proxy.test;

import com.jianbo.proxy.dao.UserDaoImpl;

public class Test {

    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.query();
    }
}
