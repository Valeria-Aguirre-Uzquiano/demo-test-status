package com.example.demo.serviceImplement;

import com.example.demo.dao.Profile;
import com.example.demo.service.ProfileService;
import org.mockito.Mockito;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProfileServiceImplement implements ProfileService {

    @Override
    public List<Profile> getProfilesByCountry(String country) {
        if(country.equals("Bolivia")) {
            return Arrays.asList(
                    new Profile("Alice", "Williams", "Bolivia"),
                    new Profile("Bob", "Marley", "Bolivia"),
                    new Profile("Alex", "Martinez", "Bolivia"),
                    new Profile("Raul", "Gonzales", "Bolivia"),
                    new Profile("Maria", "Garcia", "Bolivia"),
                    new Profile("Juan", "Perez", "Bolivia"),
                    new Profile("Carlos", "Gutierrez", "Bolivia"),
                    new Profile("Luis", "Rodriguez", "Bolivia"),
                    new Profile("Jose", "Gomez", "Bolivia"),
                    new Profile("Ana", "Hernandez", "Bolivia"),
                    new Profile("Miguel", "Sanchez", "Bolivia"),
                    new Profile("Elena", "Diaz", "Bolivia"),
                    new Profile("Pablo", "Torres", "Bolivia"),
                    new Profile("Sofia", "Flores", "Bolivia")
            );
        }else{
            return Arrays.asList(
                    new Profile("Charlie", "Garcia", "Argentina"),
                    new Profile("David", "Lee", "Argentina"),
                    new Profile("Frank", "Lambert", "Argentina"),
                    new Profile("John", "Doe", "Argentina"),
                    new Profile("Mike", "Smith", "Argentina"),
                    new Profile("Steve", "Brown", "Argentina"),
                    new Profile("Mary", "Johnson", "Argentina"),
                    new Profile("Kate", "Doe", "Argentina")
            );
        }
    }

    @Override
    public List<Profile> getAllProfiles() {
        return Arrays.asList(
                new Profile("Mary", "Johnson", "Peru"),
                new Profile("Kate", "Doe", "Peru"),
                new Profile("Alice", "Williams", "Bolivia"),
                new Profile("Bob", "Marley", "Bolivia"),
                new Profile("Alex", "Martinez", "Bolivia"),
                new Profile("Raul", "Gonzales", "Bolivia"),
                new Profile("Maria", "Garcia", "Bolivia"),
                new Profile("Juan", "Perez", "Bolivia"),
                new Profile("Carlos", "Gutierrez", "Bolivia"),
                new Profile("Luis", "Rodriguez", "Bolivia"),
                new Profile("Jose", "Gomez", "Bolivia"),
                new Profile("Ana", "Hernandez", "Bolivia"),
                new Profile("Mike", "Smith", "Chile"),
                new Profile("Miguel", "Sanchez", "Bolivia"),
                new Profile("Elena", "Diaz", "Bolivia"),
                new Profile("Pablo", "Torres", "Bolivia"),
                new Profile("Sofia", "Flores", "Bolivia"),
                new Profile("Molly", "Allen", "Peru"),
                new Profile("Charlie", "Garcia", "Argentina"),
                new Profile("David", "Lee", "Argentina"),
                new Profile("Frank", "Lambert", "Argentina"),
                new Profile("John", "Doe", "Argentina"),
                new Profile("Steve", "Brown", "Chile"),
                new Profile("Mike", "Smith", "Argentina"),
                new Profile("Steve", "Brown", "Argentina"),
                new Profile("Mary", "Johnson", "Argentina"),
                new Profile("Kate", "Doe", "Argentina")
        );
    }
}
