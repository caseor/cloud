package org.casey.cloud.account.svc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Fu Kai
 * @since 20211024
 */

@EnableFeignClients
@SpringBootApplication(scanBasePackages = {"org.casey.cloud.account.svc"})
public class AccountApplication {
  public static void main(String[] args) {
    SpringApplication.run(AccountApplication.class, args);
  }
}
