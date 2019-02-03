package joke.springframework.jokeapp.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class JokeServiceImpl implements JokeService{
    //final 선언을 통해 매 요청마다 생성하지 않고 처음에만 생성자에 의해 초기화 된 값을 갖는다
    private final  ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
         this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {

        return chuckNorrisQuotes.getRandomQuote();
    }
}
