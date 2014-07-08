package demo;

import java.io.IOException;
import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class ShowProfileInfo {
  @Autowired
  private Environment env;

  @PostConstruct
  public void verifyProductionConfigExists() throws IOException {
    System.out.println("Active: " + Arrays.toString(env.getActiveProfiles()));
    System.out.println("Default: " + Arrays.toString(env.getDefaultProfiles()));
  }
}