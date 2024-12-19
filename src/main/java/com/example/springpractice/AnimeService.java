package com.example.springpractice;

import com.example.springpractice.models.Anime;
import com.example.springpractice.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    private final AnimeRepository animeRepository;

    public AnimeService(AnimeRepository repository) {
        animeRepository = repository;
    }

    public List<Anime> findAll() {
        return animeRepository.findAll();
    }
}
