package com.devin.module;

import com.devin.feature.TestingFeatureService;
import com.devin.feature.TestingFeatureServiceImpl;
import com.devin.feature.domain.UserAccessor;
import com.devin.feature.infrastructure.database.UserPostgresAccessor;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Singleton;

public class UserModule implements Module {

  @Override
  public void configure(Binder binder) {
    binder
        .bind(TestingFeatureService.class)
        .to(TestingFeatureServiceImpl.class)
        .in(Singleton.class);

    binder
        .bind(UserAccessor.class)
        .to(UserPostgresAccessor.class)
        .in(Singleton.class);
  }
}
