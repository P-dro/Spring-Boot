package br.com.pedro.forum.controller;

import br.com.pedro.forum.controller.form.CallBackLoginForm;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/callback")
public class CallBackLoginController {

    @GetMapping("/atribuir")
    public ResponseEntity<Object> atribuir(@NotNull @RequestParam String user) {
        String userDefault = "felipe.ono";
        boolean target = false;
        if(userDefault.equals(user)){
            target = true;
            return ResponseEntity.ok().body(true);
        } else {
            return ResponseEntity.status(403).body(null);
        }
    }
}
