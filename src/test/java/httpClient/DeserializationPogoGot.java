package httpClient;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.junit.Test;
import pojo.game_of_thrones.*;
import pojo.star_wars.PlanetsPojo;

import java.io.IOException;
import java.util.Arrays;

public class DeserializationPogoGot {

    @Test
    public void namesFromGOT() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/book/characters");

        ObjectMapper objectMapper = new ObjectMapper();
        CharacterPojo[] characters = objectMapper.readValue(response.getEntity().getContent(), CharacterPojo[].class);

        for (CharacterPojo character : characters) {
            System.out.println(character.getName());
        }
    }

    @Test
    public void housesFromGOT() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/book/houses");

        ObjectMapper objectMapper = new ObjectMapper();
        HousesPojo[] houses = objectMapper.readValue(response.getEntity().getContent(), HousesPojo[].class);

        for (HousesPojo house : houses) {
            System.out.println(house.getCurrentLord());
        }
    }

    @Test
    public void mapCharactersFromGOT() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/map/characters");

        ObjectMapper objectMapper = new ObjectMapper();
        MapCharacterPojo books = objectMapper.readValue(response.getEntity().getContent(), MapCharacterPojo.class);

        for (MapCharactersPogo1 book : books.getData()) {
            System.out.println(book.getTitles());
        }
    }

    @Test
    public void locationsCharactersFromGOT() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/map/characters");

        ObjectMapper objectMapper = new ObjectMapper();
        LocationsCharacterPojo locations = objectMapper.readValue(response.getEntity().getContent(), LocationsCharacterPojo.class);

//        for (LocationsCharacterPojo location : locations) {
            System.out.println(locations.getLocations());
        }


    @Test
    public void nameCharactersFromGOT() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/book/characterlocations");

        ObjectMapper objectMapper = new ObjectMapper();
        NameCharacterLocationsPojo[] nameLocations = objectMapper.readValue(response.getEntity().getContent(), NameCharacterLocationsPojo[].class);

        for (NameCharacterLocationsPojo location : nameLocations) {
            System.out.println(location.getName());
        }
    }

    @Test
    public void name1CharactersFromGOT() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/book/characters");

        ObjectMapper objectMapper = new ObjectMapper();
        NameCharacterLocationsPojo[] names = objectMapper.readValue(response.getEntity().getContent(), NameCharacterLocationsPojo[].class);

//        for (NameCharacterLocationsPojo location : nameLocations) {
//            System.out.println(Arrays.stream(names).toList("Addam Frey"));
        }


    @Test
    public void name2CharactersFromGOT() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/book/characterlocations");

        ObjectMapper objectMapper = new ObjectMapper();
        NameCharacterLocationsPojo[] names = objectMapper.readValue(response.getEntity().getContent(), NameCharacterLocationsPojo[].class);

//        for (NameCharacterLocationsPojo location : nameLocations) {
//        System.out.println(Arrays.stream(names).toList(""));
//    }

    }
}



