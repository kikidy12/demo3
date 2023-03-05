package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TagController {
    private final TagTypeRepository tagTypeRepository;

    @GetMapping("/test")
    public ResponseEntity<List<TagType>> test() {
        List<TagType> typeList = tagTypeRepository.findAll();
        return ResponseEntity.ok().body(typeList);
    }
}
