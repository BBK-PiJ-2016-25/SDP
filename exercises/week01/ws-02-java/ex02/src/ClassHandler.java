import java.lang.reflect.Constructor;

/**
 * Created by anniehawes on 05/02/2017.
 */
public class ClassHandler {

    public void construct(Class classToBeConstructed, String[] arguments) {
        Constructor[] constructors = classToBeConstructed.getConstructors();
    }
}
