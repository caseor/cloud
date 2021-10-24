package org.casey.cloud.common.core;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.casey.cloud.common.core.consts.DelimiterConst;
import org.casey.cloud.common.core.util.StringUtil;


import java.io.Serializable;
import java.util.Map;

/**
 * @author Fu Kai
 * @since 2020/11/29 15:25
 */

@Data
@NoArgsConstructor

public class Query implements Serializable {

  private Map<String, Object> parameterMap;


  private Long pageNum;


  private Long pageSize;


  private String orderBy;

  private Boolean asc;

  public Query(Map<String, Object> parameterMap, String orderBy, Boolean asc, Long pageNum, Long pageSize) {
    this.parameterMap = parameterMap;
    if (!orderBy.contains(DelimiterConst.UNDERLINE)) {
      // 不包含下划线则 驼峰转下划线
      orderBy = StringUtil.humpToUnderline(orderBy);
    }
    this.orderBy = orderBy;
    this.asc = asc;
    this.pageNum = pageNum;
    this.pageSize = pageSize;
  }

  public void setOrderBy(String orderBy) {
    if (!orderBy.contains(DelimiterConst.UNDERLINE)) {
      // 不包含下划线则 驼峰转下划线
      orderBy = StringUtil.humpToUnderline(orderBy);
    }
    this.orderBy = orderBy;
  }
}
