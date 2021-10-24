package org.casey.web;

import org.casey.web.util.IdUtil;
import org.junit.jupiter.api.Test;

/**
 * @ClassName IdTest
 * @Author Fu Kai
 * @Description todo
 * @Date 4/11/2021 11:34 AM
 */

public class IdTest {
  @Test
  public void idTest() {
    System.out.println(IdUtil.id());
  }
  @Test
  public void timeTest() {
    System.out.println(System.currentTimeMillis());
  }

  @Test
  public void stringTest() {
    String update = "delete";
    String sql = "id DESC;deLetE from user";

    System.out.println(sql.toLowerCase().contains(update));
  }



}
