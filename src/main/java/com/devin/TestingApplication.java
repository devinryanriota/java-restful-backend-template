package com.devin;

import com.devin.feature.TestingFeatureService;
import com.devin.feature.TestingFeatureServiceImpl;
import com.devin.feature.domain.UserAccessor;
import com.devin.feature.infrastructure.database.UserPostgresAccessor;
import com.devin.feature.infrastructure.endpoint.TestingAPIImpl;
import com.devin.healthcheck.TestingHealthCheck;
import com.devin.resources.TestingResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TestingApplication extends Application<TestingConfiguration> {

  public static void main(String[] args) throws Exception {
    new TestingApplication().run(args);
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public void initialize(Bootstrap<TestingConfiguration> bootstrap) {
    super.initialize(bootstrap);
  }

  @Override
  public void run(TestingConfiguration testingConfiguration, Environment environment)
      throws Exception {
    final TestingResource resource = new TestingResource(
        testingConfiguration.getTemplate(),
        testingConfiguration.getDefaultName()
    );

    final TestingHealthCheck healthCheck =
        new TestingHealthCheck(testingConfiguration.getTemplate());

    environment.healthChecks().register("template", healthCheck);
    environment.jersey().register(resource);
    environment.jersey().register(createTestingAPI(testingConfiguration));
  }

  private TestingAPIImpl createTestingAPI(TestingConfiguration configuration) throws Exception {
    //TODO: get configuration
    UserAccessor accessor = new UserPostgresAccessor("");
    TestingFeatureService service = new TestingFeatureServiceImpl(accessor);

    return new TestingAPIImpl(service);
  }
}
