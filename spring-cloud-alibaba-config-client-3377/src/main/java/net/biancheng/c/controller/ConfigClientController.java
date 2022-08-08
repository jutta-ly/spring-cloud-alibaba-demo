package net.biancheng.c.controller;

/**
 * @author yunshu.ly
 * @version 1.0.0 @ClassName ConfigClientController.java @Description TODO
 * @createTime 2022年08月05日 17:37:00
 */
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {
  @Value("${config.info}")
  private String ConfigInfo;

  @GetMapping("/config/info")
  public String getConfigInfo() {
    return ConfigInfo;
  }
}
