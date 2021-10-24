// package org.casey.cloud.account.svc.config;
//
// import feign.Feign;
// import okhttp3.ConnectionPool;
// import okhttp3.OkHttpClient;
// import org.springframework.boot.autoconfigure.AutoConfigureBefore;
// import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
// import org.springframework.cloud.openfeign.FeignAutoConfiguration;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
//
// import java.util.concurrent.TimeUnit;
//
// /**
//  * @author Fu Kai
//  * @since 20211024
//  */
//
// @Configuration
// @ConditionalOnClass(Feign.class)
// @AutoConfigureBefore(FeignAutoConfiguration.class)
// public class OkHttpConfig {
//
//   @Bean
//   public OkHttpClient okHttpClient() {
//     return new OkHttpClient.Builder()
//       //设置连接超时
//       .connectTimeout(60, TimeUnit.SECONDS)
//       //设置读超时
//       .readTimeout(60, TimeUnit.SECONDS)
//       //设置写超时
//       .writeTimeout(60, TimeUnit.SECONDS)
//       //是否自动重连
//       .retryOnConnectionFailure(true)
//       .connectionPool(new ConnectionPool())
//       //构建OkHttpClient对象
//       .build();
//   }
// }
