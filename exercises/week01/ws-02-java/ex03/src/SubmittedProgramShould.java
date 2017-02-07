import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertTrue;

/**
 * Created by anniehawes on 07/02/2017.
 */
public class SubmittedProgramShould {

    private String className = "TestClass";


    @Test
    public void submittedProgramShouldHaveFourOrLessFields() throws Exception {
        Class studentsClass = Class.forName(className);
        assertTrue(studentsClass.getDeclaredFields().length <= 4);
    }

    @Test
    public void submittedProgramShouldHaveOnlyPrivateFields() throws Exception {
        Class studentsClass = Class.forName(className);
        Object[] nonPrivateFields = Arrays.stream(studentsClass.getDeclaredFields())
                .filter(s -> !Modifier.toString(s.getModifiers()).equals("private"))
                        .toArray();
        assertTrue(nonPrivateFields.length == 0);
    }

    @Test
    public void submittedProgramShouldHaveNoFieldsOfTypeArrayList() throws Exception {
        Class studentsClass = Class.forName(className);
        Object[] fieldsOfTypeArrayList = Arrays.stream(studentsClass.getDeclaredFields())
                .filter(s -> s.getType() == new ArrayList().getClass())
                .toArray();
        assertTrue(fieldsOfTypeArrayList.length == 0);
    }

    @Test
    public void submittedProgramShouldHaveLessThanTwoPrivateHelperMethods() throws Exception {
        Class studentsClass = Class.forName(className);
        Object[] privateMethods = Arrays.stream(studentsClass.getDeclaredMethods())
                .filter(s -> Modifier.toString(s.getModifiers()).equals("private"))
                .toArray();
        assertTrue(privateMethods.length >= 2);

    }

    @Test
    public void submittedProgramShouldHaveNoMethodsWithAThrowClause() {

    }

    @Test
    public void submittedProgramShouldHaveNoMethodsThatReturnAnInt() {

    }

    @Test
    public void submittedProgramShouldHaveAZeroArgumentConstructor() {

    }


}