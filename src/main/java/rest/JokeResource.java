package rest;

import com.google.gson.Gson;
import dtos.ChuckDTO;
import dtos.CombinedJokesDTO;
import dtos.DadDTO;
import dtos.InsultDTO;
import dtos.QuoteDTO;
import java.io.IOException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import utils.HttpUtils;

@Path("jokes")
public class JokeResource {

    @Context
    private UriInfo context;
    
    Gson gson = new Gson();

   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJokes() throws IOException {
        
        String chuck = HttpUtils.fetchData("https://api.chucknorris.io/jokes/random");
        ChuckDTO chuckDTO = gson.fromJson(chuck, ChuckDTO.class);
        
        String dad = HttpUtils.fetchData("https://icanhazdadjoke.com");
        DadDTO dadDTO = gson.fromJson(dad, DadDTO.class);
        
        String insult = HttpUtils.fetchData("https://evilinsult.com/generate_insult.php?lang=en&type=json");
        InsultDTO insultDTO = gson.fromJson(insult, InsultDTO.class);
        
        String quote = HttpUtils.fetchData("https://seinfeld-quotes.herokuapp.com/random");
        QuoteDTO quoteDTO = gson.fromJson(quote, QuoteDTO.class);
                
        CombinedJokesDTO comb = new CombinedJokesDTO(dadDTO, chuckDTO, insultDTO, quoteDTO);
        
        String combinedJSON = gson.toJson(comb);
        return combinedJSON;
        
       }

   
}
