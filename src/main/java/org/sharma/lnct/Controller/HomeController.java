package org.sharma.lnct.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "index";
    }
    @GetMapping("/1st-sem")
    public String midsem(){
        return "semester/1st-sem";
    }

    @GetMapping("/midsem-papers/bt201")
    public String bt201(){
        return "midsem-papers/1st_sem/bt201";
    }

    @GetMapping("/midsem-papers/bt102")
    public String bt102(){
        return "midsem-papers/1st_sem/bt102";
    }
    @GetMapping("midsem-papers/bt203")
    public String bt203(){
        return "midsem-papers/1st_sem/bt203";
    }
    @GetMapping("midsem-papers/bt204")
    public String bt204(){
        return "midsem-papers/1st_sem/bt204";
    }
    @GetMapping("midsem-papers/bt205")
    public String bt205(){
        return "midsem-papers/1st_sem/bt205";
    }

    @GetMapping("/2nd-sem")
    public String mi4dsem(){
        return "semester/2nd-sem";
    }

    @GetMapping("/midsem-papers/bt101")
    public String bt101(){
        return "midsem-papers/2nd_sem/bt101";
    }
    @GetMapping("/midsem-papers/bt202")
    public String bt202(){
        return "midsem-papers/2nd_sem/bt202";
    }
    @GetMapping("/midsem-papers/bt103")
    public String bt103(){
        return "midsem-papers/2nd_sem/bt103";
    }
    @GetMapping("/midsem-papers/bt104")
    public String bt104(){
        return "midsem-papers/2nd_sem/bt104";
    }
    @GetMapping("/midsem-papers/bt105")
    public String bt105(){
        return "midsem-papers/2nd_sem/bt105";
    }

    @GetMapping("/contactus")
    public String Contact(){
        return "contact";
    }

    @GetMapping("/about")
    public String about(){
        return "About";
    }

}
