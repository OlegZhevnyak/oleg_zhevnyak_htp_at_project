package web_service.items;

import java.util.List;
import java.util.Objects;

public class UserData {

    public List<UserInfo> data;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserData)) return false;
        UserData userData = (UserData) o;
        return data.equals(userData.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        return "UserData{" +
                "data=" + data +
                '}';
    }
}
