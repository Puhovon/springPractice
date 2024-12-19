package com.example.springpractice;

import com.example.springpractice.models.Anime;
import com.example.springpractice.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AnimeService {
    private final AnimeRepository animeRepository;

    public AnimeService(AnimeRepository repository) {
        animeRepository = repository;
    }

    public List<Anime> findAll() {
        return animeRepository.findAll();
    }

    public Optional<Anime> findById(int id) {
        return animeRepository.findById(id);
    }

    public Anime save(Anime anime) {
        return animeRepository.save(anime);
    }

    public void deleteById(int id) {
        animeRepository.deleteById(id);
    }
}
