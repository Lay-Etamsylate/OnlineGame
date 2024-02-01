package ltd.newbee.mall.controller.mall;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {

    @RequestMapping("/game/Tetris")
    public String Tetris() {
        return "game/Tetris";
    }
}
