package com.devin.feature.infrastructure.endpoint;

import com.devin.api.TestingAPI;
import com.devin.feature.TestingFeatureService;
import com.devin.feature.domain.User;
import java.util.List;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class TestingAPIImpl implements TestingAPI {
  private final TestingFeatureService service;

  public TestingAPIImpl(TestingFeatureService service) {
    this.service = service;
  }

  @Override
  public Response get() {
    try {
      List<User> users = service.getUsers();
      return Response.ok().entity(users).build();
    } catch (Exception e) {
      e.printStackTrace();
      return Response.serverError().status(Status.INTERNAL_SERVER_ERROR).build();
    }

  }
}
