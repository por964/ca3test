package utils;

import java.net.URL;
import java.util.concurrent.Callable;

/**
 *
 * @author claes
 */
public class Fast implements Callable {

    private final String URL;
    
    public Fast(String url) {
        this.URL = url;
    }
    

    @Override
    public String call() throws Exception {
        return HttpUtils.fetchData(URL);
    }
    
}
