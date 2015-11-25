package ua.com.webcamp.JavaAdv.Lesson06.Ex_08GSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.lang.reflect.Modifier;

/**
 * Created by Artem Vereschaka on 8/20/15.
 * artem.andzen@gmail.com
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Foo foo = new Foo(100, "FOO", "TRANSIENT");

        Gson gson = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.TRANSIENT)
                .setPrettyPrinting()
                .create();

        Writer writer = new OutputStreamWriter(new FileOutputStream("foo.json") , "UTF-8");
        gson.toJson(foo, writer);
        writer.close();
        //gson.toJson(foo, System.out);

        System.out.println("\nReading from file:");
        Reader reader = new InputStreamReader(new FileInputStream("foo.json"), "UTF-8");
        Foo newFoo = gson.fromJson(reader,Foo.class);
        reader.close();
        System.out.println(newFoo);

    }
}
