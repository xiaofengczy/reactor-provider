package com.reactor.provider.controller;

import com.reactor.provider.util.Result;
import com.reactor.provider.entity.User;
import java.util.Objects;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: MainController Description:
 *
 * @author caozhongyu
 * @create 2019/12/25
 */
@RestController
@RequestMapping("/provider")
public class MainController {

  @GetMapping("/{id}")
  public Result findUserById(@PathVariable String id) {
    if (Objects.equals(id, "1")) {
      User user = getUser(id);
      return toSuccess(user);
    }
    return toError();
  }

  private Result toError() {
    Result result = new Result();
    result.setIfSuccess(false);
    result.setCode("500");
    result.setMsg("查询用户不存在");
    result.setData(null);
    return result;
  }

  private Result toSuccess(Object object) {
    Result result = new Result();
    result.setIfSuccess(true);
    result.setCode("200");
    result.setMsg("success");
    result.setData(object);
    return result;
  }

  private User getUser(String id) {
    User user = new User();
    user.setId(id);
    user.setName("user" + id);
    user.setEmail("user" + id + "@sina.com");
    return user;
  }

}