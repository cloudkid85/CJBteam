package es.iarjona.controlador;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

   // @GetMapping({"/", "/mis-reservas"})
    public String misReservas(){
        return "redirect:/mis-reservas/page/1";
    }


}
