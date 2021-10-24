package org.casey.cloud.account.svc;

import feign.Response;
import org.casey.cloud.account.api.BaiduFeignClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Fu Kai
 * @since 20211024
 */
@SpringBootTest
public class BaiduTest {

  @Autowired
  BaiduFeignClient baiduFeignClient;

  @Test
  public void getBaidu() throws URISyntaxException {
    Response res = baiduFeignClient.baidu(new URI("https://www.baidu.com"));
    System.out.println(res.toString());
  }

}
