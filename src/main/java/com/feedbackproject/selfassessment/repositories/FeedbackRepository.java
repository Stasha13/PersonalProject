package com.feedbackproject.selfassessment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feedbackproject.selfassessment.models.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

}
