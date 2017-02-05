/**
 * Created by anniehawes on 04/02/2017.
 */
public class Launcher {

    public static void main(String[] args) {

        ClassInspector classInspector = new ClassInspector();
        classInspector.emitInterface(classInspector.getClass(args[0]));

    }

}
