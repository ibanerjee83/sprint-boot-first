
package com.example.sprintbootfirst;

import org.junit.Before;
import org.junit.Test;
 
import net.sourceforge.jwebunit.util.TestingEngineRegistry;
import static net.sourceforge.jwebunit.junit.JWebUnit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.boot.test.context.SpringBootTest;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

@SpringBootTest
public class SprintBootFirstApplicationTests {
@Before
public void preparePageload() throws FailingHttpStatusCodeException, MalformedURLException, IOException{
	WebClient webClient = new WebClient();
	HtmlPage currentPage = webClient.getPage("http://www.google.com/");
//	HtmlPage currentPage = webClient.getPage("http://localhost:8080");
	assertEquals("Google", currentPage.getTitleText());
}

@Test
public void contextLoads() {
	 System.out.println("Start 111");
//	 assertEquals("Google", currentPage.getTitleText());
  //       beginAt("login"); 
  //      assertTitleEquals("Sprint Boot JSP LogIn Page");
  //      setTextField("username", "Jack1234");
  //      assertLinkPresent("home");
  //      clickLink("home");
  //      assertTitleEquals("Home");
	}

}
