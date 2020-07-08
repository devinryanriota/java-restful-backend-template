package com.devin.common;

import com.google.common.collect.ImmutableList;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import io.dropwizard.Application;
import java.util.ArrayList;
import java.util.List;

public class ApplicationManager {
  private List<Module> modules;

  public ApplicationManager() {
    modules = new ArrayList<>();
  }

  public ApplicationManager addModules(List<Module> modules) {
    this.modules.addAll(modules);
    return this;
  }

  //for guice DI
  public Injector bootstrap() {
    List<Module> injectedModules = ImmutableList.copyOf(modules);

    Injector injector = Guice.createInjector(modules);
    injector.injectMembers(injector);
    return injector;
  }

  public void run(Class<? extends Application> applicationClass, String[] args) throws Exception {
    Injector injector = this.bootstrap();
    Application application = injector.getInstance(applicationClass);
    application.run(args);
  }
}
