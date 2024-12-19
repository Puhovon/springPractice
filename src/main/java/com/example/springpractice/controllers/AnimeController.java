package com.example.springpractice.controllers;

import com.example.springpractice.AnimeService;
import com.example.springpractice.models.Anime;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/anime")
public class AnimeController {
    private final AnimeService service;

    public AnimeController(AnimeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Anime> getAllBooks() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public List<Anime> getAnimeById(@PathVariable int id) {
        return service.findById(id).stream().toList();
    }

    @PostMapping
    public Anime addAnime(@RequestBody Anime anime) {
        return service.save(anime);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Anime> updateAnimeData(@PathVariable int id, @RequestBody Anime anime) {
        return service.findById(id).map( el -> {
            el.setTitle(anime.getTitle());
            el.setCompany(anime.getCompany());
            el.setDescription(anime.getDescription());
            return ResponseEntity.ok(service.save(el));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deleteAnime(@PathVariable int id) {
        service.deleteById(id);
    }
}
