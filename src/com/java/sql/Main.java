package com.java.sql;

import com.java.sql.connector.Connector;

public class Main {
    public static void main(String[] args){
        System.out.println("I am SQL main class");
        Connector connector = new Connector();
        connector.sqlConnector();
    }
}
