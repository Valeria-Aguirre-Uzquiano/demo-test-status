package com.example.demo.serviceImplement;

import com.example.demo.dao.Profile;
import com.example.demo.service.ProfileService;
import org.mockito.Mockito;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProfileServiceImplement implements ProfileService {

    String imageUrl1 = "https://cdn.pixabay.com/photo/2023/09/18/16/47/leaves-8260967_1280.jpg";
    String imageUrl2 = "https://cdn.pixabay.com/photo/2023/10/27/12/13/vineyard-8345243_1280.jpg";
    String imageUrl3 = "https://cdn.pixabay.com/photo/2023/10/26/15/11/mercedes-8342911_1280.jpg";
    String imageUrl4 = "https://cdn.pixabay.com/photo/2023/10/28/18/02/songbird-8348139_1280.png";
    String imageUrl5 = "https://cdn.pixabay.com/photo/2023/10/20/14/52/glacier-8329668_1280.jpg";


    @Override
    public List<Profile> getAllProfiles() {
        return Arrays.asList(
                new Profile("Charlie", "Garcia", "Argentina", imageUrl2),
                new Profile("David", "Lee", "Argentina", imageUrl3),
                new Profile("Carlos", "Gutierrez", "Bolivia", imageUrl3),
                new Profile("Luis", "Rodriguez", "Bolivia", imageUrl5),
                new Profile("Jose", "Gomez", "Bolivia", imageUrl1),
                new Profile("Frank", "Lambert", "Argentina", imageUrl5 ),
                new Profile("Kate", "Doe", "Argentina", imageUrl3),
                new Profile("Alice", "Williams", "Bolivia", imageUrl1),
                new Profile("Bob", "Marley", "Bolivia", imageUrl2),
                new Profile("Alex", "Martinez", "Bolivia", imageUrl3),
                new Profile("Steve", "Brown", "Argentina", imageUrl1),
                new Profile("Mary", "Johnson", "Argentina", imageUrl5),
                new Profile("Raul", "Gonzales", "Bolivia", imageUrl4),
                new Profile("Maria", "Garcia", "Bolivia", imageUrl5),
                new Profile("Juan", "Perez", "Bolivia", imageUrl4),
                new Profile("John", "Doe", "Argentina", imageUrl1),
                new Profile("Mike", "Smith", "Argentina", imageUrl4 ),
                new Profile("Ana", "Hernandez", "Bolivia", imageUrl2),
                new Profile("Miguel", "Sanchez", "Bolivia", imageUrl3),
                new Profile("Elena", "Diaz", "Bolivia", imageUrl4 ),
                new Profile("Pablo", "Torres", "Bolivia", imageUrl3),
                new Profile("Sofia", "Flores", "Bolivia", imageUrl5 )
        );
    }
}
