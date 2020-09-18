package tr.com.ogedik.config.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author orkun.gedik
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JiraSession {
  private String name;
  private String value;
}
