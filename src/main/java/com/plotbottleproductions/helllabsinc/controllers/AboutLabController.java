package com.plotbottleproductions.helllabsinc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("about")
public class AboutLabController {

    @GetMapping("/history")
    public String displayLabHistory(){

        return "labHistory";
    }

    @GetMapping("/mission")
    public String displayLabMission(){

        return "missionStatement";
    }

    @GetMapping("/research")
    public String displayLabResearch(){

        return "our research";
    }

}
