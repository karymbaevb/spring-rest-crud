package kg.itacademy.client.entity;

import javax.persistence.*;

@Table(name = "app_file")
@Entity
public class FileEntity extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "path")
    private String path;

    @Column(name = "extension")
    private String extension;

    @Column(name = "type")
    @Enumerated(value = EnumType.STRING)
    private FileType fileType;
}
