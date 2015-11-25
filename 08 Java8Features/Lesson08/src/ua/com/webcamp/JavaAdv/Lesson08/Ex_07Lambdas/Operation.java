package ua.com.webcamp.JavaAdv.Lesson08.Ex_07Lambdas;

/**
 * Created by Artem Vereschaka on 9/1/15.
 * artem.andzen@gmail.com
 */

/**
 * Represents some operation
 * @param <T> parameter type
 * @param <F> return type
 */
public interface Operation<T, F> {
    F operation(T t);
}
