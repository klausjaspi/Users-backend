package com.example.demo.appuser;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class AppUserResource {

    private final AppUserService appUserService;


    public AppUserResource(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<AppUser>> getAllUsers() {
        List<AppUser> users = appUserService.findAllUsers();

        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<AppUser> getEmployeeById (@PathVariable("id") Long id) {
        AppUser appUser = appUserService.findAppUserById(id);
        return new ResponseEntity<>(appUser, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<AppUser> signUp(@RequestBody AppUser appUser) {
        AppUser newUser = appUserService.signUp(appUser);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<AppUser> updateEmployee(@RequestBody AppUser appUser) {
        AppUser updateUser = appUserService.updateUser(appUser);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) {
        appUserService.deleteAppUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
