package com.devin.feature.infrastructure.database;

import com.devin.feature.domain.User;
import com.devin.feature.domain.UserAccessor;
import com.devin.jooq.tables.Users;
import com.devin.jooq.tables.records.UsersRecord;
import java.net.URI;
import java.util.List;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.impl.DSL;

public class UserPostgresAccessor implements UserAccessor {

  private final String username;
  private final String password;
  private final String dbUrl;
  private final DSLContext dslContext;

  private final UserDbAdapter adapter;

  public UserPostgresAccessor(String databaseUrl) throws Exception {
    //TODO: don't hardcode here, but get from configuration

    username = "fdr";
    password = "default123";
    dbUrl = "jdbc:postgresql://localhost:5432/fdr_data";
    dslContext = DSL.using(dbUrl, username, password);
    adapter = new UserDbAdapter();
  }

  @Override
  public List<User> getUsers() {
    Users table = Users.USERS;
    Result<UsersRecord> userRecords = dslContext
        .selectFrom(table)
        .fetch();
    return adapter.translatePostgresToModel(userRecords);
  }
}
