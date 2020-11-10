package dtos;

import jokeEntities.Quote;

/**
 *
 * @author claes
 */
public class QuoteDTO {
    

    private String quote;
    private String url = "https://seinfeld-quotes.herokuapp.com/random";

    public QuoteDTO(Quote sw) {
        this.quote = sw.getQuote();
        this.url = sw.getUrl();
    }
    
    public QuoteDTO(String quote) {
        this.quote = quote;
    }

    public QuoteDTO() {
    }
    

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
    
    
    
    
}
