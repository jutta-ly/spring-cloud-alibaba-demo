package net.biacheng.c.controller;

/**
 * @author yunshu.ly
 * @version 1.0.0 @ClassName DeptController.java @Description TODO
 * @createTime 2022年08月05日 17:21:00
 */
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DeptController {
  @Value("${server.port}")
  private String serverPort;

  @GetMapping(value = "/dept/nacos/{id}")
  public String getPayment(@PathVariable("id") Integer id) {
    return "<h2>c语言中文网提醒您，服务访问成功！</h2>服务名：spring-cloud-alibaba-provider<br /> 端口号： "
        + serverPort
        + "<br /> 传入的参数："
        + id;
  }
}
