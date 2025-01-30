package com.engr.necy.myHngDetails.dto;

import lombok.Data;

import java.time.Instant;

@Data
public class MyDetailsDto {
    private String email;
    private String current_datetime;
    private String github_url;

    public MyDetailsDto(String email, String current_datetime, String github_url){
        this.email = email;
        this.current_datetime = Instant.now().toString();
        this.github_url = github_url;
    }

    public String getEmail(){return email; }
    public  String getCurrent_datetime(){return current_datetime;}
    public  String getGithub_url(){return github_url;}

}
