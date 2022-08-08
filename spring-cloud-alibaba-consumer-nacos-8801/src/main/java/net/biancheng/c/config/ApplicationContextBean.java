package net.biancheng.c.config;

/**
 * @author yunshu.ly
 * @version 1.0.0 @ClassName ConfigBean.java @Description TODO
 * @createTime 2022年08月05日 17:29:00
 */
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextBean {
  /**
   * 与 Ribbon 集成，并开启负载均衡功能
   *
   * @return
   */
  @Bean
  @LoadBalanced
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }
}
