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

    @GetMapping("/CS_3rd-sem")
    public String CS_thirdSemester(){
        return "semester/CS_3rd-sem";
    }

    @GetMapping("/AL_3rd-sem")
    public String AL_thirdSemester(){
        return "semester/AL_3rd-sem";
    }

    @GetMapping("/midsem-papers/al301")
    public String al301(){
        return "midsem-papers/AL_3rd-sem/al301";
    }

    @GetMapping("/midsem-papers/al302")
    public String al302(){
        return "midsem-papers/AL_3rd-sem/al302";
    }

    @GetMapping("/midsem-papers/al303")
    public String al303(){
        return "midsem-papers/AL_3rd-sem/al303";
    }

    @GetMapping("/midsem-papers/al304")
    public String al304(){
        return "midsem-papers/AL_3rd-sem/al304";
    }

    @GetMapping("/midsem-papers/al305")
    public String al305(){
        return "midsem-papers/AL_3rd-sem/al305";
    }

    @GetMapping("/midsem-papers/es301")
    public String es301(){
        return "midsem-papers/CS_3rd-sem/es301";
    }

    @GetMapping("/midsem-papers/cs302")
    public String cs302(){
        return "midsem-papers/CS_3rd-sem/cs302";
    }

    @GetMapping("/midsem-papers/cs303")
    public String cs303(){
        return "midsem-papers/CS_3rd-sem/cs303";
    }

    @GetMapping("/midsem-papers/cs304")
    public String cs304(){
        return "midsem-papers/CS_3rd-sem/cs304";
    }

    @GetMapping("/midsem-papers/cs305")
    public String cs305(){
        return "midsem-papers/CS_3rd-sem/cs305";
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
