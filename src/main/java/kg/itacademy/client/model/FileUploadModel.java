package kg.itacademy.client.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class FileUploadModel {
    private MultipartFile file;
}
