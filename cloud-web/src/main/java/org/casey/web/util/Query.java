package org.casey.web.util;

import com.google.common.collect.Maps;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;
import java.util.Optional;

/**
 * @author Fu Kai
 * @since 20201129
 */

@Data
@NoArgsConstructor
public class Query implements Serializable {

  /**
   * 当前页
   */
  private Integer pageNum;

  /**
   * 分页大小 pageSize为 0 时查询所有, 不分页
   */
  private Integer pageSize;

  /**
   * ORDER BY id DESC
   */
  private String orderBy;

  /**
   * 计数
   */
  private Boolean count;

  /**
   * 参数集合
   */
  private Map<String, Object> parameterMap;

  public void setOrderBy(String orderBy) {
    String orderByLowerCase = orderBy.toLowerCase();
    if (orderByLowerCase.contains("insert") || orderByLowerCase.contains("delete") || orderByLowerCase.contains("update") || orderByLowerCase.contains("select") || orderByLowerCase.contains("drop")|| orderByLowerCase.contains("truncate")) {
      throw new RuntimeException("想注入我?");
    }
    this.orderBy = orderBy;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Integer getPageNum() {
    return Optional.ofNullable(pageNum).orElse(1);
  }

  public Integer getPageSize() {
    return Optional.ofNullable(pageSize).orElse(10);
  }

  public Boolean getCount() {
    return Optional.ofNullable(count).orElse(true);
  }

  public Map<String, Object> getParameterMap() {
    return Optional.ofNullable(parameterMap).orElse(Maps.newHashMap());
  }
}
