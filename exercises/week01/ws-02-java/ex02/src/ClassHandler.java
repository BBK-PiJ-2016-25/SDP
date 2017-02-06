import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by anniehawes on 05/02/2017.
 */
public class ClassHandler {

    /**
     * Constructs a new instance of a class, with the desired specification passed as arguments.
     * Arguments must be specified in the correct order as shown in the constructor
     * @param classToBeConstructed the class to be constructed, as a String
     * @param arguments arguments for the class, provided in an array of Strings alternating
     * between type and associated value
     * @return the requested class instance.
     */
    public Object construct(Class classToBeConstructed, String[] arguments) throws Exception {
        // Splitting the arguments array into types and parameters
        ArrayList types = new ArrayList();
        ArrayList parameters = new ArrayList();
        // Using the type flag to apportion Strings to types or parameters appropriately
        boolean type = true;
        int j = 0;
        for (int i = 0; i < arguments.length; i++) {
            if (type) {
                types.add(arguments[i]);
            } else {
                parameters.add(arguments[i]);
                j++;
            }
            type = !type;
        }
        // Fetching the class's constructors
        Constructor[] constructors = classToBeConstructed.getConstructors();
        Constructor constructor = constructors[0];
        // Checking which of the constructors matches the given parameter types
        for(Constructor candidate : constructors) {
            if (Arrays.toString(candidate.getParameterTypes()).equals(Arrays.toString(types.toArray()))) {
                constructor = candidate;
            }
        }
        // Converting the parameters array into varargs readable format
        Object[] parametersArgs = parameters.toArray();
        for(int counter = 0; counter < parametersArgs.length; counter++) {
            System.out.println(constructor.getParameterTypes()[counter].toString());
            if(constructor.getParameterTypes()[counter].toString().equals("long")) {
                parametersArgs[counter] = Long.parseLong(parametersArgs[counter].toString());
            } else if (constructor.getParameterTypes()[counter].toString().equals("int")) {
                parametersArgs[counter] = Integer.parseInt(parametersArgs[counter].toString());
            } else if (constructor.getParameterTypes()[counter].toString().equals("float")){
                parametersArgs[counter] = Float.parseFloat(parametersArgs[counter].toString());
            } else {
                parametersArgs[counter] = constructor.getParameterTypes()[counter].cast(parametersArgs[counter]);
                counter++;
            }
        }

        System.out.println(constructor.toString());
        System.out.println(Arrays.toString(parametersArgs));
        return constructor.newInstance(parametersArgs);
    }
}
