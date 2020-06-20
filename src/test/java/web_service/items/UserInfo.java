package web_service.items;

import java.util.Objects;

public class UserInfo {

    public int id;
    public String username;
    public String realname;
    public String password;
    public String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserInfo)) return false;
        UserInfo userInfo = (UserInfo) o;
        return id == userInfo.id &&
                username.equals(userInfo.username) &&
                realname.equals(userInfo.realname) &&
                password.equals(userInfo.password) &&
                email.equals(userInfo.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, realname, password, email);
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
