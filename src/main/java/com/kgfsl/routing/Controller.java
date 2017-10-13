package com.kgfsl.routing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.kgfsl.routing.Register;
import com.kgfsl.routing.RegService;
@RestController
@RequestMapping("/register")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class Controller
{
    @Autowired
    private RegService service;

 @RequestMapping(value = "/createRegister", method = RequestMethod.POST)
   public Register createRegistration(@RequestBody Register register) {
       System.out.println(register);
       return service.createRegistration(register);
   }
}