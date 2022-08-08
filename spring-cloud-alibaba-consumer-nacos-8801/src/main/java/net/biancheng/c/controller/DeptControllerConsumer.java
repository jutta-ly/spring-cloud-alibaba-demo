package net.biancheng.c.controller;

/**
 * @author yunshu.ly
 * @version 1.0.0 @ClassName DeptController_Consumer.java @Description TODO
 * @createTime 2022年08月05日 17:30:00
 */
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;

@RestController
@Slf4j
public class DeptControllerConsumer {
  @Resource private RestTemplate restTemplate;
  /** 服务提供者的服务名 */
  @SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
  @Value("${service-url.nacos-user-service}")
  private String serverURL;

  @GetMapping("/consumer/dept/nacos/{id}")
  public String paymentInfo(@PathVariable("id") Long id) {
    return restTemplate.getForObject(serverURL + "/dept/nacos/" + id, String.class);
  }
}
