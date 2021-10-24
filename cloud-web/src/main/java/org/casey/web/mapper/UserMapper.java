package org.casey.web.mapper;

import org.casey.web.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author Fu Kai
 * @since 20210411
 */

@Repository
public interface UserMapper {

  /**
   * 查询
   */
  List<User> select(Map<String, Object> map);

  /**
   * 新增数据
   * @param user 实例对象
   * @return 影响行数
   */
  int insert(User user);

  /**
   * 批量插入
   */
  void insertBatch(User user);

  /**
   * 修改数据
   * @param user 实例对象
   * @return 影响行数
   */
  int update(User user);

}

