package jp.co.ichain.luigi2.resources.code;

import java.util.HashMap;
import java.util.Map;
import lombok.val;

/**
 * 通知内容
 * 
 * @author : [VJP] タン
 * @createdAt : 2021-08-25
 * @updatedAt : 2021-08-25
 */
public class Luigi2CodeNotifications {

  /**
   * 通知方法
   * 
   * 00:メール
   * 
   * @author : [VJP] タン
   * @createdAt : 2021-08-25
   * @updatedAt : 2021-08-25
   */
  public enum NotificationMethod {
    EMAIL("00");

    String val;

    private static final Map<String, NotificationMethod> stringToEnum =
        new HashMap<String, NotificationMethod>();

    static {
      for (val val : values()) {
        stringToEnum.put(val.toString(), val);
      }
    }

    NotificationMethod(String val) {
      this.val = val;
    }

    @Override
    public String toString() {
      return this.val;
    }

    public static NotificationMethod findBy(String str) {
      return stringToEnum.get(str);
    }
  }
  
  /**
   * 通知実施
   * 
   * 0:メール送信前
   * 1:メール送信済み
   * 
   * @author : [AOT] g.kim
   * @createdAt : 2021-12-23
   * @updatedAt : 2021-12-23
   */
  public enum NotificationImplementation {
    BEFORE_MAIL_SEND("0"), MAIL_SENDED("1");

    String val;

    NotificationImplementation(String val) {
      this.val = val;
    }

    @Override
    public String toString() {
      return this.val;
    }
  }
}
