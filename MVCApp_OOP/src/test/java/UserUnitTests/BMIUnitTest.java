package UserUnitTests;
import org.junit.jupiter.api.*;
import Models.Rider;
public class BMIUnitTest {
    static Rider riderObj;
    double actualValue;
    @BeforeAll
    public static void CreateRider()
    {
        riderObj=new Rider();
    }
    @BeforeEach
    public void AssignValues()
    {
        riderObj.setAge(25);
        riderObj.setCountry("Sri Lanka");
        riderObj.setName("Joy");
        riderObj.setHeight(173);
        riderObj.setWeight(78.5);
        actualValue=riderObj.calBMI(riderObj.getWeight(), riderObj.getHeight());
    }
    @Test
    public void TestBMI()
    {
        Assertions.assertEquals(78.5, actualValue,0.1);
    }
    @AfterEach
    public void CleanValues()
    {
        riderObj.setAge(0);
        riderObj.setCountry(null);
        riderObj.setName(null);
        riderObj.setHeight(0);
        riderObj.setWeight(0.0);
        actualValue=0;
    }
    @AfterAll
    public static void DeleteRider()
    {
        riderObj=null;
    }
}
