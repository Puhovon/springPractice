package com.example.springpractice.repository;

import com.example.springpractice.models.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeRepository extends JpaRepository<Anime, Integer> {
}
