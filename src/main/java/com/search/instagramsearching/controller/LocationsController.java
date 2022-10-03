package com.search.instagramsearching.controller;

import com.search.instagramsearching.service.LocationsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class LocationsController {
    private final LocationsService locationsService;
}