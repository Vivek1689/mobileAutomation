package basePackage;

import org.testng.annotations.Test;

import java.util.Set;

public class TestContext extends iOSBaseClass{
    @Test
    public void contextTest(){
        Set<String> contexts = iosDriver.getContextHandles();
        for(String context: contexts){
            System.out.println(context);
        }
    }
}
