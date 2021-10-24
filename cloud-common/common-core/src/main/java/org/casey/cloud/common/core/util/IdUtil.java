package org.casey.cloud.common.core.util;

/**
 * @author Fu Kai
 * @date 20210104
 */

public class IdUtil {
  /**
   * 生成32位的UUID
   */
  public static String generate() {
    return cn.hutool.core.util.IdUtil.fastSimpleUUID();
  }
}
