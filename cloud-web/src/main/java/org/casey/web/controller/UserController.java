package org.casey.web.controller;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import org.casey.cloud.common.core.Result;
import org.casey.web.service.UserService;
import org.casey.web.util.Query;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Fu Kai
 * @since 20210411
 */

@RestController
@RequestMapping("/user")
@Api("UserController")
public class UserController {

  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping
  public Result hello() {
    return Result.success(null, "hello world!");
  }

  @PostMapping
  public Result page(@RequestBody Query query) {
    return Result.success(userService.page(query), "");
  }


}
