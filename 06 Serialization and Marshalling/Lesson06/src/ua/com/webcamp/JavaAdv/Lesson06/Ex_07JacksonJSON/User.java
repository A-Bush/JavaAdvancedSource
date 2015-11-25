package ua.com.webcamp.JavaAdv.Lesson06.Ex_07JacksonJSON;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Vereschaka on 8/20/15.
 * artem.andzen@gmail.com
 */
public class User {

    /**
     * Nickname of user
     */
    @JsonProperty("Name")
    private String nickname;
    @JsonIgnore
    private String pass;
    @JsonProperty("Messages")
    private List<String> messages = new ArrayList<>();

    public User(String nickname, String pass) {
        this.nickname = nickname;
        this.pass = pass;
    }

    public User() { // NEEDED FOR JACKSON
    }

    public void sendMsg(String msg)
    {
        messages.add(msg);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "nickname='" + nickname + '\'' +
                ", pass='" + pass + '\'' +
                ", messages=" + messages +
                '}';
    }
}
