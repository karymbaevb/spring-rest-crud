package kg.itacademy.client.service;

import kg.itacademy.client.model.FileUploadModel;
import kg.itacademy.client.model.FileModel;

public interface FileService {
    FileModel createNewModel(FileUploadModel file);
}
