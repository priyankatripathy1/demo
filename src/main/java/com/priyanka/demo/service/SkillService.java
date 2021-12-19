package com.priyanka.demo.service;

import com.priyanka.demo.entities.Skill;
import com.priyanka.demo.repositories.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SkillService {
    private SkillRepository repository;

    public SkillService(SkillRepository skillRepository){
        this.repository=skillRepository;
    }
    public Skill getSkill(int id){
        Optional<Skill> s= repository.findById(id);
        if (s.isEmpty()) {
            throw new RuntimeException();
        }
        return s.get();
    }
    public Skill saveSkill(Skill skill ){
        Skill s=repository.save(skill);
        return s;
    }
}
