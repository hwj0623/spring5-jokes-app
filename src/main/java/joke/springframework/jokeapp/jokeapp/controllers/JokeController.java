package joke.springframework.jokeapp.jokeapp.controllers;

import joke.springframework.jokeapp.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})                //context의 root와 매핑 시킴.
    public String showJoke(Model model){     //인풋 파라미터를 구체화 시키면 spring이 모델 인스턴스를 파라미터로 메소드에 전달한다
        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
