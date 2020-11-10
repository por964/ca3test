
package dtos;

import jokeEntities.Insult;

/**
 *
 * @author claes
 */
public class InsultDTO {
    
    private String insult;
    private String url = "https://evilinsult.com/generate_insult.php?lang=en&type=json";

    public InsultDTO(String insult) {
        this.insult = insult;
    }
    
    public InsultDTO(Insult insult) {
        this.insult = insult.getInsult();
        this.url = insult.getUrl();
    }

    public String getInsult() {
        return insult;
    }

    public void setInsult(String insult) {
        this.insult = insult;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
    
    
    
    
    
}
