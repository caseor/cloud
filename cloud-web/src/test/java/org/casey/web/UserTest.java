package org.casey.web;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.casey.web.entity.User;
import org.casey.web.mapper.UserMapper;
import org.casey.web.service.UserService;
import org.casey.web.util.IdUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class UserTest {

  @Autowired
  UserService userService;

  @Autowired
  UserMapper userMapper;

  @Autowired
  SqlSessionFactory sqlSessionFactory;

  @Test
  void insertBatchTest() {
    SqlSession sqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH, false);
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    for (int i = 0; i < 1000; i++) {
      User user = new User();
      user.setId(IdUtil.id());
      user.setName("batch - " + i);
      user.setEnabled(true);
      user.setBirthday(LocalDateTime.now());
      user.setAge((int) (Math.random() * 100));
      userMapper.insertBatch(user);
      if (i % 1000 == 999) {
        // 每1000条提交一次 防止内存溢出
        sqlSession.commit();
        sqlSession.clearCache();
      }
    }
    sqlSession.commit();
    sqlSession.clearCache();
  }

  @Test
  public void insertTest() {
    User user = User.builder()
      .id(IdUtil.id())
      .name("Fu Kai")
      .age(21)
      .birthday(LocalDateTime.now())
      .enabled(true)
      .build();
    System.out.println(userMapper.insert(user));
    System.out.println(user.getId());
  }


}
