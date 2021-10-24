package org.casey.web.service;

import com.github.pagehelper.PageInfo;
import org.casey.web.entity.User;
import org.casey.web.util.Query;

/**
 * @author Fu Kai
 * @since 20210411
 */

public interface UserService {

  PageInfo<User> page(Query query);

  /**
   * 新增数据
   * @param user 实例对象
   * @return 实例对象
   */
  int insert(User user);

  /**
   * 修改数据
   * @param user 实例对象
   * @return 实例对象
   */
  int update(User user);

}
