package kg.itacademy.client.controller;

import kg.itacademy.client.model.ClientModel;
import kg.itacademy.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientRestController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUserById(@PathVariable("userId") Integer userId){
        return ResponseEntity.ok(clientService.getClient(userId));
    }

    @PostMapping
    public ResponseEntity<?> createNewUser(@RequestBody ClientModel clientModel){

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(clientService.createClient(clientModel));
    }

    @PutMapping("/{userId}")
    public ResponseEntity<?> updateUserById(@PathVariable("userId") Integer userId, @RequestBody ClientModel clientModel){
        return null;
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<?> deleteUserById(@PathVariable("userId") Integer userId){
        return null;
    }

}
