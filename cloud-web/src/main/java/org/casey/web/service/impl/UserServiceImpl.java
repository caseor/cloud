package org.casey.web.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.casey.web.entity.User;
import org.casey.web.mapper.UserMapper;
import org.casey.web.service.UserService;
import org.casey.web.util.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Fu Kai
 * @since 20210411
 */

@Service
public class UserServiceImpl implements UserService {

  private final UserMapper userMapper;

  @Autowired
  public UserServiceImpl(UserMapper userMapper) {
    this.userMapper = userMapper;
  }

  @Override
  public PageInfo<User> page(Query query) {
    PageHelper.startPage(query.getPageNum(), query.getPageSize(), query.getOrderBy())
      .setCount(query.getCount())
      .setReasonable(true)
      .setPageSizeZero(query.getPageSize() == 0);
    return new PageInfo<>(userMapper.select(query.getParameterMap()));
  }

  /**
   * 新增数据
   * @param user 实例对象
   * @return 实例对象
   */
  @Override
  public int insert(User user) {
    return userMapper.insert(user);
  }

  /**
   * 修改数据
   * @param user 实例对象
   * @return 实例对象
   */
  @Override
  public int update(User user) {
    return userMapper.update(user);
  }

}
