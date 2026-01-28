package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")

public class SoftwareEngineerController{
    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Naleesha",
                        "js,Java"
                ),new SoftwareEngineer(
                        2,
                        "Thanushka",
                        "js,HTML, CSS"
                ),new SoftwareEngineer(
                        3,
                        "Devinda",
                        "js,react"
                )
        );
    }

}

