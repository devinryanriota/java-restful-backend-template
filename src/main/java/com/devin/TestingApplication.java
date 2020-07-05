package com.devin;

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
  }
}
