package com.sparklink.aws_jsb_sns.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="rest-api-aws-sns")
public class AwsJsbSnsController {

    @GetMapping("/produce-message")
    public String produceMessage(){
        return "AWS - SNS Produce Message.....";
    }

}
