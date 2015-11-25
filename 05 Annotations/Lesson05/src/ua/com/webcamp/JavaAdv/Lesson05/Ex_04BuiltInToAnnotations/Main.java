package ua.com.webcamp.JavaAdv.Lesson05.Ex_04BuiltInToAnnotations;

/**
 * Created by Artem Vereschaka on 8/18/15.
 * artem.andzen@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        CustomInterface ciAnon = new CustomInterface() {
            @Override
            public int doSomething(int param) {
                return param * param;
            }
        };

        //or

        CustomInterface ciLambda = (x) -> (x * x);

        System.out.println(ciAnon.doSomething(12));
        System.out.println(ciLambda.doSomething(12));
    }
}
