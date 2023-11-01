package com.example.demo.service;

import com.example.demo.dao.Profile;

import java.util.List;

public interface ProfileService {
    List<Profile> getProfilesByCountry(String country);
    List<Profile> getAllProfiles();
}
