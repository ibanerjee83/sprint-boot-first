
package com.example.sprintbootfirst;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertLinkPresent;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertTitleEquals;
import static net.sourceforge.jwebunit.junit.JWebUnit.beginAt;
import static net.sourceforge.jwebunit.junit.JWebUnit.clickLink;
import static net.sourceforge.jwebunit.junit.JWebUnit.setBaseUrl;
import static net.sourceforge.jwebunit.junit.JWebUnit.setTestingEngineKey;
 
import org.junit.Before;
import org.junit.Test;
 
import net.sourceforge.jwebunit.util.TestingEngineRegistry;
import static net.sourceforge.jwebunit.junit.JWebUnit.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SprintBootFirstApplicationTests {
@Before
public void prepare() throws Exception {
        setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT); 
        setBaseUrl("http://localhost:8080/login");
    }

@Test
public void contextLoads() {
        beginAt("login.jsp"); 
        assertTitleEquals("Sprint Boot JSP LogIn Page");
        setTextField("username", "Jack1234");
  //      assertLinkPresent("home");
  //      clickLink("home");
  //      assertTitleEquals("Home");
	}

}
