package org.casey.web.util.log;

/**
 * @author Fu Kai
 * @since 20210411
 */

public class StdoutLogger extends com.p6spy.engine.spy.appender.StdoutLogger {
  @Override
  public void logText(String text) {
    // 打印红色 SQL 日志
    System.err.println(text);
  }
}
