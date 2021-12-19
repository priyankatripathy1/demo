package com.priyanka.demo.controller;

import com.priyanka.demo.entities.Skill;
import com.priyanka.demo.service.SkillService;
import org.springframework.web.bind.annotation.*;

@RestController
public class SkillController {
    private SkillService skillService;

    public SkillController(SkillService skillService) {

        this.skillService=skillService;
    }

    @GetMapping("/skills/{id}")
    public Skill getSkill(@PathVariable int id){
       Skill s= skillService.getSkill(id);
       return s;
    }
    @PutMapping("/skills/{id}")
    public Skill putSkill(@RequestBody Skill skill){
        Skill sk=skillService.saveSkill(skill);
        return sk;
    }
}
