package web.model;

/**
 * 用户模型
 * Created by huxingyue on 2017/9/4.
 */
public class User {
    private int id;
    private String user_uuid;
    private String user_token;
    private String user_name;
    private String user_create_time;
    private String user_avatr;
    private String user_status;
    private String user_permission;

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

    public String getUser_create_time() {
        return user_create_time;
    }

    public void setUser_create_time(String user_create_time) {
        this.user_create_time = user_create_time;
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

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_uuid='" + user_uuid + '\'' +
                ", user_token='" + user_token + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_create_time='" + user_create_time + '\'' +
                ", user_avatr='" + user_avatr + '\'' +
                ", user_status='" + user_status + '\'' +
                ", user_permission='" + user_permission + '\'' +
                '}';
    }

    public User(int id, String user_uuid, String user_token, String user_name, String user_create_time, String user_avatr, String user_status, String user_permission) {
        this.id = id;
        this.user_uuid = user_uuid;
        this.user_token = user_token;
        this.user_name = user_name;
        this.user_create_time = user_create_time;
        this.user_avatr = user_avatr;
        this.user_status = user_status;
        this.user_permission = user_permission;
    }
}
