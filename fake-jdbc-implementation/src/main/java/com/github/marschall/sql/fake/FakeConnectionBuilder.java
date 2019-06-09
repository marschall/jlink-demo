package com.github.marschall.sql.fake;

import com.github.marschall.sql.ConnectionBuilder;

public class FakeConnectionBuilder implements ConnectionBuilder {

  @Override
  public ConnectionBuilder user(String username) {
    return this;
  }

  @Override
  public ConnectionBuilder password(String password) {
    return this;
  }


}
