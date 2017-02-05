import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Created by anniehawes on 04/02/2017.
 */
public class ClassInspector {

    public Class getClass(String name) {
        try {
            return Class.forName(name);
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void emitInterface(Class inspectedClass) {

        Field[] fields = inspectedClass.getFields();
        Constructor[] constructors = inspectedClass.getConstructors();
        Method[] methods = inspectedClass.getMethods();

        System.out.print(

                "Modifier: \n" +
                Modifier.toString(inspectedClass.getModifiers()) + "\n \n" +

                "Interface / Class: \n" +
                inspectedClass.toString().substring(0, inspectedClass.toString().indexOf(' ')) + "\n \n" +

                "Name: \n" +
                inspectedClass.getSimpleName() + "\n \n" +

                "Fields: \n" +
                (fields.length > 0
                        ? Arrays.stream(fields).
                            map(s -> s.toString()).
                                reduce((a, b) -> a + "\n" + b) + "\n"
                : "None present") + "\n \n" +

                "Constructors: \n" +
                (constructors.length > 0
                        ? Arrays.stream(constructors).
                            map(s -> s.toString()).
                                reduce((a, b) -> a + "\n" + b) + "\n"
                : "None present") + "\n \n" +

                "Methods: \n" +
                        (methods.length > 0
                                ? Arrays.stream(methods).
                                map(s -> s.toString()).
                                reduce((a, b) -> a + "\n" + b) + "\n"
                 : "None present") + "\n \n"
        );
    }

}
