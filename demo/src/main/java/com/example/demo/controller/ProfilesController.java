package com.example.demo.controller;


import com.example.demo.dao.Profile;
import com.example.demo.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfilesController {

    @Autowired
    private ProfileService profileService;

    public ProfilesController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/getProfilesByCountry/{country}")
    public List<Profile> getProfilesByCountry(@PathVariable String country) {
        return profileService.getProfilesByCountry(country);
    }

    @GetMapping("/getAllProfiles")
    public List<Profile> getAllProfiles() {
        return profileService.getAllProfiles();
    }
}
