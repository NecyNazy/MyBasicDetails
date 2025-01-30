package com.engr.necy.myHngDetails.service;

import com.engr.necy.myHngDetails.dto.MyDetailsDto;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class MyDetailsService {
    public MyDetailsDto getMyDetails() {
        return new MyDetailsDto("estherlinus090@gmail.com", Instant.now().toString(), "https://github.com/Code-Mistress/MyHNGBasicDetails");
    }
}
