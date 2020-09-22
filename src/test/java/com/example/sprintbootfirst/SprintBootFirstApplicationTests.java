
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
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;

@SpringBootTest
public class SprintBootFirstApplicationTests {

@Before
public void preparePageload() throws FailingHttpStatusCodeException, MalformedURLException, IOException{
	WebClient webClient = new WebClient();
	HtmlPage currentPage = webClient.getPage("http://www.google.com/");
//	HtmlPage currentPage = webClient.getPage("http://localhost:8080");
	assertEquals("Google", currentPage.getTitleText());
}
/*
@Test
public void contextLoads() throws FailingHttpStatusCodeException, MalformedURLException, IOException {
	 System.out.println("Start 111");
	 WebClient webClient1 = new WebClient();
	 HtmlPage currentPage = webClient1.getPage("http://localhost:8080/login");
	 assertEquals("Sprint Boot JSP LogIn Page", currentPage.getTitleText());
//	Get the query input text
	 HtmlInput queryInput = currentPage.getElementByName("name");
	 queryInput.setValueAttribute("indra");
	 HtmlInput queryInput2 = currentPage.getElementByName("password");
	queryInput2.setValueAttribute("mypass");
	 
//	Submit the form by pressing the submit button
	 HtmlSubmitInput submitBtn = currentPage.getElementByName("sub");
	 currentPage = submitBtn.click();
	 
	}
*/
}
