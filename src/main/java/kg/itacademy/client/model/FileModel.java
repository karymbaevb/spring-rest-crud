package kg.itacademy.client.model;

import kg.itacademy.client.entity.FileType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileModel {
    private String name;
    private String path;
    private String extension;
    private FileType fileType;
}
