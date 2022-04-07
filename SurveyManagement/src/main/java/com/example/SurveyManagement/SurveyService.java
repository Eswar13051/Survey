package com.example.SurveyManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class SurveyService {
    @Autowired
    private SurveyRepository repo;
    public List<SurveyDetails> listAll() {
        return repo.findAll();
    }

    public void save(SurveyDetails surveyDetails) {
        repo.save(surveyDetails);
    }

    public SurveyDetails get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}

