package com.devin.feature;

import com.devin.feature.domain.User;
import com.devin.feature.domain.UserAccessor;
import java.util.List;

public class TestingFeatureServiceImpl implements TestingFeatureService {

  private final UserAccessor _userAccessor;

  public TestingFeatureServiceImpl(UserAccessor accessor) {
    this._userAccessor = accessor;
  }

  @Override
  public List<User> getUsers() {
    return _userAccessor.getUsers();
  }
}
