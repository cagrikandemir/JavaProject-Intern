package com.finalproject.finalproject.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="p_like")
@Data
public class Like {
    @Id
    Long id;
    Long userId;
    Long postId;
}
