package net.biancheng.c;

/**
 * @author yunshu.ly
 * @version 1.0.0 @ClassName SpringCloudAlibabaConsumerNacos8801Application.java @Description TODO
 * @createTime 2022年08月05日 17:27:00
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SuppressWarnings("AlibabaCommentsMustBeJavadocFormat")
@SpringBootApplication
@EnableDiscoveryClient // 开启服务注册与发现功能
public class SpringCloudAlibabaConsumerNacos8801Application {
  public static void main(String[] args) {
    SpringApplication.run(SpringCloudAlibabaConsumerNacos8801Application.class, args);
  }
}
