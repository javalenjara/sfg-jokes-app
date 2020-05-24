package guru.springframework.sfgjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    private final ChuckNorrisQuotes jokesQuote;

    public JokesServiceImpl(ChuckNorrisQuotes jokesQuote) {
        this.jokesQuote = jokesQuote;
    }

    @Override
    public String getRandomJoke() {
        return jokesQuote.getRandomQuote();
    }
}
