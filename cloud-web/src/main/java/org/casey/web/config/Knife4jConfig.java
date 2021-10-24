package org.casey.web.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;


/**
 * @author Code2021
 * @since 20201130
 */
@Data
@Configuration
@EnableSwagger2WebMvc
@ConfigurationProperties(prefix = "knife4j")
public class Knife4jConfig {
    private final static String BASE_PACKAGE = "org.casey.web.controller";

    // private final SecuritySettings securitySettings;
    private Boolean enable;

    // @Autowired
    // public Knife4jConfig(SecuritySettings securitySettings) {
    //     this.securitySettings = securitySettings;
    // }

    @Bean
    public Docket defaultApi2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(enable)
                .apiInfo(apiInfo())
                // .securitySchemes(apiKeyList())
                // .securityContexts(securityContextList())
                .groupName("1.0.0").select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .contact(new Contact("Fu Kai", "http://fukai.asia", "caseyfu@qq.com"))
                .title("EPM Enterprise Personnel Management")
                .description("cloud")
                .termsOfServiceUrl("http://fukai.asia")
                .version("1.0.0")
                .build();
    }

    // private List<SecurityScheme> apiKeyList() {
    //     if (securitySettings.getAccessToken()) {
    //         return Lists.newArrayList(new ApiKey("BearerToken", SecurityConst.TOKEN_HEADER, "header"));
    //     }
    //     return Lists.newArrayList();
    // }
    //
    // private List<SecurityContext> securityContextList() {
    //     if (securitySettings.getAccessToken()) {
    //         return Lists.newArrayList(SecurityContext.builder()
    //                 .securityReferences(defaultAuth())
    //                 // 所有添加Authorization
    //                 // .forPaths(PathSelectors.regex("/.*"))
    //                 // 仅/epm/auth/token添加Authorization
    //                 // .forPaths(PathSelectors.regex("/epm/auth/token"))
    //                 // 仅/epm/auth/token不添加Authorization
    //                 .forPaths(PathSelectors.regex("/epm/auth/token").negate())
    //                 .build());
    //     }
    //     return Lists.newArrayList();
    // }

    // private List<SecurityReference> defaultAuth() {
    //     AuthorizationScope[] authorizationScopes = {new AuthorizationScope("global", "accessEverything")};
    //     return Lists.newArrayList(new SecurityReference("BearerToken", authorizationScopes));
    // }

}
