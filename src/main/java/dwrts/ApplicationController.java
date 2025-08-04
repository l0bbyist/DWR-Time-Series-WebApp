package dwrts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
	
	@GetMapping("/login")
    public String login(){
        return "login";
    }
	
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/index")
    public String home(){
        return "index";
    }
    @GetMapping("/reader")
    public String reader(){
       return "reader";
   }
    @GetMapping("/newdevice")
    public String newdevice(){
        return "newdevice";
    }
    
    @GetMapping("/newstaff")
    public String newstaff(){
        return "newstaff";
    }
    @GetMapping("/stafflist")
    public String stafflist(){
        return "stafflist";
    }
    @GetMapping("/newcountry")
    public String newcountry(){
        return "newcountry";
    }
    @GetMapping("/countrieslist")
    public String countrieslist(){
        return "countrieslist";
    }
    @GetMapping("/inventoryreport")
    public String inventoryreport(){
        return "inventoryreport";
    }
    @GetMapping("/supplierreport")
    public String supplierreport(){
        return "supplierreport";
    }
    @GetMapping("/newuser")
    public String newuser(){
        return "newuser";
    }
    @GetMapping("/assigndevice")
    public String assigndevice(){
        return "assigndevice";
    }
    @GetMapping("/details")
    public String details(){
        return "details";
    }
    @GetMapping("/chat")
    public String chat() {
    	return "chat";
    }
    
    @GetMapping("/profile")
    public String profile() {
    	return "profile";
    }
}