
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

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SprintBootFirstApplicationTests {
    @Before
    public void prepare() {
        setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT); 
        setBaseUrl("http://localhost:8081/login");
    }

	@Test
	void contextLoads() {
        beginAt("login.jsp"); 
        assertTitleEquals("Sprint Boot JSP LogIn Page");
  //      assertLinkPresent("home");
  //      clickLink("home");
  //      assertTitleEquals("Home");
	}

}
