package ltd.newbee.mall.controller.mall;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import ltd.newbee.mall.service.NewBeeMallGoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GameController {
    @GetMapping("/game/{gameId}")
    public String gamePage(@PathVariable("gameId") Long gameId, HttpServletRequest request) {
        return "game/" + gameId;
    }
}
