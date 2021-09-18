package com.yanfuchang.controller;


import com.yanfuchang.bean.Jacoco;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/jacoco")
public class JacocoController {

    @ResponseBody
    @RequestMapping(value = "/test", method=RequestMethod.POST, consumes = "application/json")
    public String jacoco(
            @RequestBody Jacoco jacoco
            ){
        if ("daling".equals(jacoco.getData())) {
            return "daling";
        }else if ("dalingjia".equals(jacoco.getData())){
            return "dalingjia";
        }else{
            return "222";
        }
    }

}
