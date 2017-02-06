import java.util.Arrays;
import java.util.Date;

/**
 * Created by anniehawes on 05/02/2017.
 */
public class Launcher {
    public static void main(String[] args) throws Exception {
        ClassHandler classHandler = new ClassHandler();
        classHandler.construct(Class.forName(args[0]), Arrays.copyOfRange(args, 1, args.length));
    }
}
