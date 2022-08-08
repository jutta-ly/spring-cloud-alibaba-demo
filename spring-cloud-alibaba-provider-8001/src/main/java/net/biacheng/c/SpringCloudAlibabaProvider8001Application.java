package net.biacheng.c;

/**
 * @author yunshu.ly
 * @version 1.0.0 @ClassName SpringCloudAlibabaProvider8001Application.java @Description TODO
 * @createTime 2022年08月05日 17:21:00
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SuppressWarnings("AlibabaCommentsMustBeJavadocFormat")
@SpringBootApplication
@EnableDiscoveryClient // 开启服务发现功能
public class SpringCloudAlibabaProvider8001Application {
  public static void main(String[] args) {
    SpringApplication.run(SpringCloudAlibabaProvider8001Application.class, args);
  }
}
