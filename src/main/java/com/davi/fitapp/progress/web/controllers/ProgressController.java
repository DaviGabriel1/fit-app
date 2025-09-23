package com.davi.fitapp.progress.web.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("progress")
public class ProgressController {

    @GetMapping("{uuid}")
    public ResponseEntity getProgressByUserId(@PathVariable String uuid) {

        return ResponseEntity.ok().body(null);
    }
}
