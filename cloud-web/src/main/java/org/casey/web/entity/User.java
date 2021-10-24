package org.casey.web.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author Fu Kai
 * @since 20210411
 */

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
  private static final long serialVersionUID = -35973483039965598L;

  private Long id;

  private String name;

  private Integer age;
  /**
   * 可用状态 0不可用 1可用
   */
  private Boolean enabled;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private LocalDateTime birthday;

}
