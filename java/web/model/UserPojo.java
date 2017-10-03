package web.model;

import java.util.Date;

/**
 * 用户模型
 * Created by huxingyue on 2017/9/4.
 */
public class UserPojo {
    private int id;
    private String user_uuid;   //用户uuid
    private String user_token;  //用户token
    private String user_name;   //用户名
    private String user_avatr;  //用户头像
    private String user_status; //用户状态
    private String user_permission; //用户权限
    private Date create_time;   //创建时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_uuid() {
        return user_uuid;
    }

    public void setUser_uuid(String user_uuid) {
        this.user_uuid = user_uuid;
    }

    public String getUser_token() {
        return user_token;
    }

    public void setUser_token(String user_token) {
        this.user_token = user_token;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_avatr() {
        return user_avatr;
    }

    public void setUser_avatr(String user_avatr) {
        this.user_avatr = user_avatr;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    public String getUser_permission() {
        return user_permission;
    }

    public void setUser_permission(String user_permission) {
        this.user_permission = user_permission;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
