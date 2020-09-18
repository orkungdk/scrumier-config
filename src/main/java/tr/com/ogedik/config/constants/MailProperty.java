package tr.com.ogedik.config.constants;

import lombok.Getter;

/**
 * @author orkun.gedik
 */
@Getter
public enum MailProperty implements GenericProperty {
  SMTP_HOST(null),
  SMTP_PORT(null),
  SMTP_USERNAME(null),
  SMTP_PASSWORD(null);

  private String defaultValue;

  MailProperty(String defaultValue) {
    this.defaultValue = defaultValue;
  }
}
