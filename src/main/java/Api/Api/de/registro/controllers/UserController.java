package Api.Api.de.registro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Api.Api.de.registro.models.User;
import Api.Api.de.registro.repositories.UserRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:5173") // Cambia el puerto si usas otro
public class UserController {

    @Autowired
    private UserRepository userRepository;

@PostMapping("/register")
public ResponseEntity<?> registerUser(@Valid @RequestBody User user) {
    User savedUser = userRepository.save(user);
    return ResponseEntity.ok(savedUser);
}

}
