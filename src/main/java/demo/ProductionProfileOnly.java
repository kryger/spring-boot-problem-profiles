package demo;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
public class ProductionProfileOnly {
  @PostConstruct
  public void verifyProductionConfigExists() throws IOException {
    System.out.println("Production profile ON");
  }
}