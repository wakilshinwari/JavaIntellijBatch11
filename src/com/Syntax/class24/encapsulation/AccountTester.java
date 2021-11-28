package com.Syntax.class24.encapsulation;

import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;

public class AccountTester {
    public static void main(String[] args) {
        Account account=new Account();
        account.setName("Yougita");
        System.out.println(account.getName());
    }
}
