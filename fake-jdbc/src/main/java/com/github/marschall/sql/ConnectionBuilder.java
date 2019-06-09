package com.github.marschall.sql;

import org.ietf.jgss.GSSCredential;

public interface ConnectionBuilder {

  ConnectionBuilder user(String username);

  ConnectionBuilder password(String password);

//  ConnectionBuilder gssCredential(GSSCredential credential);

  default ConnectionBuilder gssCredential(GSSCredential credential) {
    throw new IllegalStateException("unsupported operation");
  }

}
