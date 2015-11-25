package ua.com.webcamp.JavaAdv.Lesson06.Ex_07JacksonJSON;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by Artem Vereschaka on 8/20/15.
 * artem.andzen@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("Allan", "pass12345");
        user.sendMsg("Hello there!");
        user.sendMsg("How are you??");

        ObjectMapper mapper = new ObjectMapper();

        try{
            mapper.writeValue(new File("user.json"),user); // check file
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user));
            System.out.println("\nReading from file:");

            User newUser = mapper.readValue(new File("user.json"), User.class);
            System.out.println(newUser);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
