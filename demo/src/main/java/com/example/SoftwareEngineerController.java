package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")

public class SoftwareEngineerController {

    public List<SoftwareEngineer> getEngineers(){
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Naleesha",
                        "js,node, React"
                ),new SoftwareEngineer(
                        2,
                        "Saman",
                        "js,node, React"
                ),new SoftwareEngineer(
                        1,
                        "Kamal",
                        "java, html, css"
                )

        );
    }


}
