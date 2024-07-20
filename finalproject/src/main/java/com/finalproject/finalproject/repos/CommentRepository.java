package com.finalproject.finalproject.repos;

import com.finalproject.finalproject.Entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository <Comment, Long> {

}
