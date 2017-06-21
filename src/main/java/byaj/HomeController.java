package byaj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by student on 6/20/17.
 */
@Controller
public class HomeController {
    @Autowired
    private ClassmateRepository classmateRepository;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/")
    public String newClassmate(Model model){
        model.addAttribute("classmate", new Classmate());
        return "form";
    }
    @PostMapping("/add")
    public String processClassmate(@Valid Classmate classmate, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "form";
        }
        classmateRepository.save(classmate);
        return "result";
    }
}
