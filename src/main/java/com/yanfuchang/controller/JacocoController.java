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


    @ResponseBody
    @RequestMapping(value = "/test2", method=RequestMethod.POST, consumes = "application/json")
    public String jacoco2(
            @RequestBody Jacoco jacoco
    ){
        System.out.println("1");
        if ("daling2".equals(jacoco.getData())) {
            return "daling2";
        }else if ("dalingjia2".equals(jacoco.getData())){
            return "dalingjia2";
        }else{
            return "222";
        }
    }


    @ResponseBody
    @RequestMapping(value = "/test3", method=RequestMethod.POST, consumes = "application/json")
    public String jacoco3(
            @RequestBody Jacoco jacoco
    ){
        System.out.println("2");
        if ("daling3".equals(jacoco.getData())) {
            return "daling3";
        }else if ("dalingjia3".equals(jacoco.getData())){
            return "dalingjia3";
        }else{
            return "333";
        }
    }
}
