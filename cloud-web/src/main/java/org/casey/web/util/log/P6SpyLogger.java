package org.casey.web.util.log;

import com.p6spy.engine.spy.appender.MessageFormattingStrategy;
import org.casey.cloud.common.core.util.DateUtil;

import java.time.LocalDateTime;

/**
 * @author Fu Kai
 * @since 20210411
 */

public class P6SpyLogger implements MessageFormattingStrategy {

  @Override
  public String formatMessage(int connectionId, String now, long elapsed, String category, String prepared, String sql, String s4) {
    return !"".equals(sql.trim()) ? LocalDateTime.now() + " [" + category + "] consume: " + elapsed + "ms" + " - connectionId: " + connectionId + "\n " + sql.replaceAll("[\\s]+", " ") + ";" : "";
  }
}
