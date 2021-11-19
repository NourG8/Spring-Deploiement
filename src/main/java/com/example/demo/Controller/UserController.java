package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable(value = "id") Long idUser){
    	Optional<User> user=userRepository.findById(idUser);
		if (user.isPresent()) { 
			return user.get();
		}
		else throw new RuntimeException("User introuvable");
    }
    
    @PostMapping("/users")
    public User createEmployee( @RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable(value = "id") Long idUser,@RequestBody User user) {
    	User u=userRepository.findById(idUser).get();
    	
		u.setIdUser(user.getIdUser());
		u.setNom(user.getNom());
		u.setPrenom(user.getPrenom());
		u.setAdress(user.getAdress());
		u.setCin(user.getCin());
		u.setEmail(user.getEmail());
		u.setCompetance(user.getCompetance());
		u.setPwd(user.getPwd());
		u.setTel(user.getTel());
		u.setDateEmbauche(user.getDateEmbauche());
		u.setPhoto(user.getPhoto());
		userRepository.save(u);
		
	 	return u;
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable(value = "id") Long idUser){
    User cp=userRepository.getOne(idUser);
	userRepository.delete(cp);
	return "delete succesfully code : "+idUser;
    }
}
