package kg.itacademy.client.controller;

import kg.itacademy.client.model.DocumentModel;
import kg.itacademy.client.model.FileUploadModel;
import kg.itacademy.client.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/document")
public class DocumentRestController {

    @Autowired
    private FileService fileService;

    @PostMapping
    public ResponseEntity<?> createNewDocument(@RequestBody DocumentModel documentModel){
        return null;
    }

    @PostMapping("/image/upload")
    public ResponseEntity<?> uploadImage(@ModelAttribute("file") FileUploadModel fileFromFrontend){
        fileService.createNewModel(fileFromFrontend);
        return null;
    }
}
