package org.casey.cloud.account.api;

import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.URI;

/**
 * @author Fu Kai
 * @since 20211024
 */

@FeignClient
public interface BaiduFeignClient {
  @GetMapping
  Response baidu(URI uri);
}
