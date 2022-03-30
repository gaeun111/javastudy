package com.test;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicBorders.MenuBarBorder;

class Member {

    private String userid;
    private String username;
    private int age;

Member(String userid, String username, int age){
    this.userid = userid;
    this.username = username;
    this.age = age;
    
}

public String getUserid(){ return userid;}
public String getUsername(){ return username;}
public int getAge(){ return age;}

}


public class jdbc {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        String url = "jdbc:mariadb://127.0.0.1:3306/webdev";
        String userid = "webmaster";
        String userpw = "0805";
        String query = "select userid, username, age from tbl_test";
    
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
    
        Class.forName("org.mariadb.jdbc");
        con = DriverManager.getConnection(url, userid, userpw);
        stmt = con.createStatement();
        rs = stmt.executeQuery(query);
    
        List<Member> list = new ArrayList<>();
    }
}
