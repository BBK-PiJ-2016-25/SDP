import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
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

        System.out.print(

                Modifier.toString(inspectedClass.getModifiers())
                + " interface "
                + inspectedClass.getName()
                + " {\n \n"
                + (fields.length > 0 ? Arrays.stream(fields).map(s -> s.toString()).reduce((a, b) -> a + "\n" + b) + "/n" : "")
                + Arrays.stream(constructors).map(s -> s.toString()).reduce((a, b) -> a + "\n" + b)

        );
    }
}
