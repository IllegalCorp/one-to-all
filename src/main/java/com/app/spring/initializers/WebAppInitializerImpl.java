package com.app.spring.initializers;

import com.app.spring.configs.RootConfig;
import com.app.spring.configs.SecurityConfig;
import com.app.spring.configs.WebConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializerImpl implements WebApplicationInitializer {

  public void onStartup(ServletContext container) throws ServletException {
    AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
    context.register(RootConfig.class, WebConfig.class, SecurityConfig.class);
    context.setServletContext(container);
    context.refresh();

    ServletRegistration.Dynamic registration =
        container.addServlet("dispatcher", new DispatcherServlet(context));
    registration.setLoadOnStartup(1);
    registration.addMapping("/");
  }
}
