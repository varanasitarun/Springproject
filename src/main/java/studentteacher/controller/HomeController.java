package studentteacher.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.parameters.P;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    //TEST CONTROLLER
    @GetMapping("/")
    public String greet(HttpServletRequest request)
    {
        return "Welcome"+request.getSession().getId();
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request)
    {
        return (CsrfToken) request.getAttribute("_csrf");
    }


}
