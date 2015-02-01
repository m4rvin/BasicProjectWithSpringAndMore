package com.lh.mvcex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping(value = { "/", "home" }, method = RequestMethod.GET)
	public String home_jsp(Locale locale, Model model) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		// here the View Resolver will transform "home" to "home.jsp" and will
		// look for a file with such a name. If it exists, the "model" will be
		// used to build the dynamic page and populate the fields
		return "home";
	}

	@RequestMapping(value = { "/custom" }, method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
	public @ResponseBody String home_custom(Locale locale, Model model) {

		return "<html><body>CIAO</body></html>";
	}

	@RequestMapping(value = { "/static" }, method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
	public @ResponseBody Resource home_static(Locale locale, Model model) {
		Resource resource = new ClassPathResource("home.html");
		return resource;
	}
}
