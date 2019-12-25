package com.reactor.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * FileName: App Description:
 *
 * @author caozhongyu
 * @create 2019/12/25
 */
@SpringBootApplication
@EnableDiscoveryClient
public class App {

  public static void main(String[] args) {
    SpringApplication.run(App.class);
  }

}