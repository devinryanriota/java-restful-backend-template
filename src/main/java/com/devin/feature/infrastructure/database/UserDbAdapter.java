package com.devin.feature.infrastructure.database;

import com.devin.feature.domain.User;
import com.devin.feature.domain.UserGender;
import com.devin.feature.domain.UserType;
import com.devin.jooq.tables.records.UsersRecord;
import java.util.List;
import java.util.stream.Collectors;

public class UserDbAdapter {
  public List<User> translatePostgresToModel(List<UsersRecord> records) {
    return records.stream()
        .map(r -> new User(
            r.getEmail(),
            UserType.valueOf(r.getType()),
            r.getFullName(),
            r.getPhoneNumber(),
            r.getDateOfBirth(),
            UserGender.valueOf(r.getGender())))
        .collect(Collectors.toList());
  }
}
