package com.github.marschall.sql.user;

import com.github.marschall.sql.ConnectionBuilder;
import com.github.marschall.sql.fake.FakeConnectionBuilder;

public class ConnectionBuilderUser {

  public static void main(String[] args) {
    ConnectionBuilder connectionBuilder = new FakeConnectionBuilder();
    connectionBuilder.user("scott").password("swordfish");
    System.out.println(connectionBuilder);
  }

}
