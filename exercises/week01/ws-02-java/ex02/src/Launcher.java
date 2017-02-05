/**
 * Created by anniehawes on 05/02/2017.
 */
public class Launcher {
    public static void main(String[] args) {
        ClassHandler classHandler = new ClassHandler();
        classHandler.construct(Class.forName(args[0]), args[1:]);
    }
}
