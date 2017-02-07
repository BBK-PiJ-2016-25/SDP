import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertTrue;

/**
 * Created by anniehawes on 07/02/2017.
 */
public class SubmittedProgramShould {

    private Class studentsClass = Class.forName("TestClass");

    @Test
    public void submittedProgramShouldHaveFourOrLessFields {
        assertTrue(studentsClass.getDeclaredFields().length <= 4);
    }

    @Test
    public void submittedProgramShouldHaveOnlyPrivateFields {
        Object[] nonPrivateFields = Arrays.stream(studentsClass.getDeclaredFields())
                .filter(s -> !s.toString(s.getModifiers()).equals("private")
                        .toArray();
        assertTrue(nonPrivateFields.length == 0);
    }

    @Test
    public void submittedProgramShouldHaveNoFieldsOfTypeArrayList {
        Object[] fieldsOfTypeArrayList = Arrays.stream(studentsClass.getDeclaredFields())
                .filter(s -> s.getType() == Class.forName(java.util.ArrayList))
                .toArray();
        assertTrue(fieldsOfTypeArrayList.length == 0);
    }

    @Test
    public void submittedProgramShouldHaveLessThanTwoPrivateHelperMethods {

    }

    @Test
    public void submittedProgramShouldHaveNoMethodsWithAThrowClause {

    }

    @Test
    public void submittedProgramShouldHaveNoMethodsThatReturnAnInt {

    }

    @Test
    public void submittedProgramShouldHaveAZeroArgumentConstructor {

    }


}