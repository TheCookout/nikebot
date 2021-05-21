package nike.platform.persion;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import javax.persistence.*;
import java.io.Serializable;

/****
* Personnel management;
  * Is the purchased account;
  * The theme design idea here is that wherever the mark is available, then it must be available.
 *
 *
 * */
@Accessors(chain = true)
@Entity
@Getter@Setter
@Table(
        indexes = {
                @Index(columnList = "igroup"),
                @Index(columnList = "login_status")
        }
)
public class Persion implements Serializable {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /***
     * 机器用的；
     */
    @Getter @Setter
    private String client_id;

    /***
     * login用的；
     */
    @Column(columnDefinition = "text")
    @Getter @Setter
    private String refresh_token;

    /***
     * login用的；
     */
    @Column(columnDefinition = "text")
    @Getter @Setter
    private String authorization;

    /***
     * login用的；
     */
    @Getter @Setter
    private String username;

    /***
     * login用的；
     */
    @Getter @Setter
    private String password;


    /***
     * 登录状态；
     */
    @Getter @Setter
    @Column(name = "login_status")
    private int loginStatus;

    /**
     * 折扣码
     */
    @Getter @Setter
    @Column(name = "igroup")
    private String igroup;
    /**
     * 红玉
     */
    @Getter @Setter
    private String firstName;
    /**
     * 纪
     */
    @Getter @Setter
    private String lastName;
    /**
     * 唐家岭新城
     */
    @Getter @Setter
    private String address2;
    /**
     * 北京市
     */
    @Getter @Setter
    private String city;
    /**
     * WeChat
     */
    @Getter @Setter
    private String postalCode;

    /**
     * 唐家岭新城t05小区5号楼1单元502
     */
    @Getter @Setter
    private String address1;

    /**
     * 海淀区
     */
    @Getter @Setter
    private String county;

    /**
     * jihongyu19870122@163.com
     */
    @Getter @Setter
    private String email;

    /**
     * 13426269235
     */
    @Getter @Setter
    private String phoneNumber;

    /**
     * WeChat
     */
    @Getter @Setter
    private String type;
    /**
     * state
     * CN-11
     * 暂时不知道什么意思
     */
    @Getter @Setter
    private String state;


}
