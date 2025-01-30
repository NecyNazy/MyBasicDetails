package com.engr.necy.myHngDetails.controller;

import com.engr.necy.myHngDetails.dto.MyDetailsDto;
import com.engr.necy.myHngDetails.service.MyDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api")
@CrossOrigin(origins = "*")
public class MyDetailsController {
 private final MyDetailsService myDetailsService;

 public  MyDetailsController(MyDetailsService myDetailsService){
  this.myDetailsService = myDetailsService;
 }

 @GetMapping(value = "/myDetails")
 public MyDetailsDto getMyDetails(){
    return myDetailsService.getMyDetails();
 }
 }