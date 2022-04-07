package com.example.SurveyManagement;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository  extends JpaRepository<SurveyDetails,Long> {
}
