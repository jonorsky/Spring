package com.hellokoding.springboot.view;

import java.util.Map;
import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping({"/", "/hello"})
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/shet")
    public String what(Model model){
      model.addAttribute("subname","edabun");
      model.addAttribute("name","edabun");

      Map<String, String> map = new HashMap<>();
      map.put("spring", "mvc");
      model.addAttribute("message", "Baeldung");
      model.mergeAttributes(map);

      System.out.println(model);

      return "what";
    }

    @GetMapping("/caller")
    public String x(){
      return "what";
    }
}
