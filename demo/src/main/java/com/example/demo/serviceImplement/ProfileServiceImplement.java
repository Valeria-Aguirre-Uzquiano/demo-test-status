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
                    new Profile("Alice", "Williams", "Bolivia", "https://pixabay.com/es/photos/sale-de-plantas-follaje-8260967/"),
                    new Profile("Bob", "Marley", "Bolivia", "https://pixabay.com/es/photos/calabazas-v%C3%ADspera-de-todos-los-santos-8032727/"),
                    new Profile("Alex", "Martinez", "Bolivia", "https://pixabay.com/es/photos/velas-luz-de-una-vela-luz-de-la-vela-8286709/"),
                    new Profile("Raul", "Gonzales", "Bolivia", "https://pixabay.com/es/vectors/resumen-est%C3%A9tico-arte-antecedentes-8336084/"),
                    new Profile("Maria", "Garcia", "Bolivia", "https://pixabay.com/es/photos/sale-de-plantas-follaje-8260967/"),
                    new Profile("Juan", "Perez", "Bolivia", "https://pixabay.com/es/photos/vi%C3%B1edo-agricultura-granja-oto%C3%B1o-8345243/"),
                    new Profile("Carlos", "Gutierrez", "Bolivia", "https://www.istockphoto.com/es/foto/viejo-muelle-de-madera-en-el-lago-tiro-al-atardecer-gm1432690812-474858468?utm_source=pixabay&utm_medium=affiliate&utm_campaign=SRP_image_sponsored&utm_content=https%3A%2F%2Fpixabay.com%2Fes%2Fimages%2Fsearch%2F%3Forder%3Dec&utm_term=naturaleza"),
                    new Profile("Luis", "Rodriguez", "Bolivia", "https://pixabay.com/es/photos/velas-luz-de-una-vela-luz-de-la-vela-8286709/"),
                    new Profile("Jose", "Gomez", "Bolivia", "https://pixabay.com/es/photos/vi%C3%B1edo-agricultura-granja-oto%C3%B1o-8345243/"),
                    new Profile("Ana", "Hernandez", "Bolivia", "https://pixabay.com/es/photos/sale-de-plantas-follaje-8260967/"),
                    new Profile("Miguel", "Sanchez", "Bolivia", "https://pixabay.com/es/vectors/resumen-est%C3%A9tico-arte-antecedentes-8336084/"),
                    new Profile("Elena", "Diaz", "Bolivia", "https://pixabay.com/es/photos/calabazas-v%C3%ADspera-de-todos-los-santos-8032727/"),
                    new Profile("Pablo", "Torres", "Bolivia", "https://pixabay.com/es/photos/vi%C3%B1edo-agricultura-granja-oto%C3%B1o-8345243/"),
                    new Profile("Sofia", "Flores", "Bolivia", "https://pixabay.com/es/photos/velas-luz-de-una-vela-luz-de-la-vela-8286709/")
            );
        }else{
            return Arrays.asList(
                    new Profile("Charlie", "Garcia", "Argentina", "https://pixabay.com/es/photos/calabazas-v%C3%ADspera-de-todos-los-santos-8032727/"),
                    new Profile("David", "Lee", "Argentina", "https://pixabay.com/es/photos/velas-luz-de-una-vela-luz-de-la-vela-8286709/"),
                    new Profile("Frank", "Lambert", "Argentina", "https://www.istockphoto.com/es/foto/viejo-muelle-de-madera-en-el-lago-tiro-al-atardecer-gm1432690812-474858468?utm_source=pixabay&utm_medium=affiliate&utm_campaign=SRP_image_sponsored&utm_content=https%3A%2F%2Fpixabay.com%2Fes%2Fimages%2Fsearch%2F%3Forder%3Dec&utm_term=naturaleza"),
                    new Profile("John", "Doe", "Argentina", "https://pixabay.com/es/vectors/resumen-est%C3%A9tico-arte-antecedentes-8336084/"),
                    new Profile("Mike", "Smith", "Argentina", "https://pixabay.com/es/photos/calabazas-v%C3%ADspera-de-todos-los-santos-8032727/"),
                    new Profile("Steve", "Brown", "Argentina", "https://pixabay.com/es/photos/sale-de-plantas-follaje-8260967/"),
                    new Profile("Mary", "Johnson", "Argentina", "https://pixabay.com/es/vectors/resumen-est%C3%A9tico-arte-antecedentes-8336084/"),
                    new Profile("Kate", "Doe", "Argentina", "https://pixabay.com/es/photos/sale-de-plantas-follaje-8260967/")
            );
        }
    }

    @Override
    public List<Profile> getAllProfiles() {
        return Arrays.asList(
                new Profile("Alice", "Williams", "Bolivia", "https://pixabay.com/es/photos/sale-de-plantas-follaje-8260967/"),
                new Profile("Bob", "Marley", "Bolivia", "https://pixabay.com/es/photos/calabazas-v%C3%ADspera-de-todos-los-santos-8032727/"),
                new Profile("Alex", "Martinez", "Bolivia", "https://pixabay.com/es/photos/velas-luz-de-una-vela-luz-de-la-vela-8286709/"),
                new Profile("Raul", "Gonzales", "Bolivia", "https://pixabay.com/es/vectors/resumen-est%C3%A9tico-arte-antecedentes-8336084/"),
                new Profile("Charlie", "Garcia", "Argentina", "https://pixabay.com/es/photos/calabazas-v%C3%ADspera-de-todos-los-santos-8032727/"),
                new Profile("David", "Lee", "Argentina", "https://pixabay.com/es/photos/velas-luz-de-una-vela-luz-de-la-vela-8286709/"),
                new Profile("Frank", "Lambert", "Argentina", "https://www.istockphoto.com/es/foto/viejo-muelle-de-madera-en-el-lago-tiro-al-atardecer-gm1432690812-474858468?utm_source=pixabay&utm_medium=affiliate&utm_campaign=SRP_image_sponsored&utm_content=https%3A%2F%2Fpixabay.com%2Fes%2Fimages%2Fsearch%2F%3Forder%3Dec&utm_term=naturaleza"),
                new Profile("Kate", "Doe", "Argentina", "https://pixabay.com/es/photos/sale-de-plantas-follaje-8260967/"),
                new Profile("Maria", "Garcia", "Bolivia", "https://pixabay.com/es/photos/sale-de-plantas-follaje-8260967/"),
                new Profile("Juan", "Perez", "Bolivia", "https://pixabay.com/es/photos/vi%C3%B1edo-agricultura-granja-oto%C3%B1o-8345243/"),
                new Profile("Carlos", "Gutierrez", "Bolivia", "https://www.istockphoto.com/es/foto/viejo-muelle-de-madera-en-el-lago-tiro-al-atardecer-gm1432690812-474858468?utm_source=pixabay&utm_medium=affiliate&utm_campaign=SRP_image_sponsored&utm_content=https%3A%2F%2Fpixabay.com%2Fes%2Fimages%2Fsearch%2F%3Forder%3Dec&utm_term=naturaleza"),
                new Profile("Luis", "Rodriguez", "Bolivia", "https://pixabay.com/es/photos/velas-luz-de-una-vela-luz-de-la-vela-8286709/"),
                new Profile("Jose", "Gomez", "Bolivia", "https://pixabay.com/es/photos/vi%C3%B1edo-agricultura-granja-oto%C3%B1o-8345243/"),
                new Profile("John", "Doe", "Argentina", "https://pixabay.com/es/vectors/resumen-est%C3%A9tico-arte-antecedentes-8336084/"),
                new Profile("Mike", "Smith", "Argentina", "https://pixabay.com/es/photos/calabazas-v%C3%ADspera-de-todos-los-santos-8032727/"),
                new Profile("Steve", "Brown", "Argentina", "https://pixabay.com/es/photos/sale-de-plantas-follaje-8260967/"),
                new Profile("Mary", "Johnson", "Argentina", "https://pixabay.com/es/vectors/resumen-est%C3%A9tico-arte-antecedentes-8336084/"),
                new Profile("Ana", "Hernandez", "Bolivia", "https://pixabay.com/es/photos/sale-de-plantas-follaje-8260967/"),
                new Profile("Miguel", "Sanchez", "Bolivia", "https://pixabay.com/es/vectors/resumen-est%C3%A9tico-arte-antecedentes-8336084/"),
                new Profile("Elena", "Diaz", "Bolivia", "https://pixabay.com/es/photos/calabazas-v%C3%ADspera-de-todos-los-santos-8032727/"),
                new Profile("Pablo", "Torres", "Bolivia", "https://pixabay.com/es/photos/vi%C3%B1edo-agricultura-granja-oto%C3%B1o-8345243/"),
                new Profile("Sofia", "Flores", "Bolivia", "https://pixabay.com/es/photos/velas-luz-de-una-vela-luz-de-la-vela-8286709/")
        );
    }
}
