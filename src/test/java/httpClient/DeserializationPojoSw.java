package httpClient;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.junit.Test;
import pojo.game_of_thrones.*;
import pojo.star_wars.PeoplePojo;
import pojo.star_wars.PlanetsPojo;
import pojo.star_wars.StarshipsPojo;

import java.io.IOException;
import java.util.Arrays;

public class DeserializationPojoSw {

    @Test
    public void planetsFromSw() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://swapi.dev/api/planets?page=1");

        ObjectMapper objectMapper = new ObjectMapper();
        PlanetsPojo[] planets = objectMapper.readValue(response.getEntity().getContent(), PlanetsPojo[].class);

        for (PlanetsPojo planet : planets) {
            System.out.println(planet.getClimate());
        }
    }

        @Test
        public void peopleFromSw() throws IOException {
            HttpResponse response = HttpClientUtils.getGetResponse("https://swapi.dev/api/people/?page=1");

            ObjectMapper objectMapper = new ObjectMapper();
          PeoplePojo[] people = objectMapper.readValue(response.getEntity().getContent(), PeoplePojo[].class);

            for (PeoplePojo human : people) {
                System.out.println(human.getEye_color());
            }
        }

    @Test
    public void starshipsFromSw() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://swapi.dev/api/starships/?page=1");

        ObjectMapper objectMapper = new ObjectMapper();
        StarshipsPojo[] starships = objectMapper.readValue(response.getEntity().getContent(), StarshipsPojo[].class);

        for (StarshipsPojo starship : starships) {
            System.out.println(starship.getLength());
        }
    }
}


