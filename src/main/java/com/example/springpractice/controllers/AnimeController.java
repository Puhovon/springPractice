package com.example.springpractice.controllers;

import com.example.springpractice.AnimeService;
import com.example.springpractice.models.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
