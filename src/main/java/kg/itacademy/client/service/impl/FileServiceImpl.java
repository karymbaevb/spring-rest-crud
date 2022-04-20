package kg.itacademy.client.service.impl;

import kg.itacademy.client.model.FileUploadModel;
import kg.itacademy.client.model.FileModel;
import kg.itacademy.client.service.FileService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class FileServiceImpl implements FileService {
    private static final String basePathToDir = "C:/projects/client/uploaded/file";
    @Override
    public FileModel createNewModel(FileUploadModel file) {
        try {
            createFilePhysicalServer(file);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return null;
    }

    private void createFilePhysicalServer(FileUploadModel fromFrontend) throws IOException {
        if(fromFrontend.getFile().getSize() <= 0 ){
            return;
        }

        File createNewFile = new File(basePathToDir);

        if(!createNewFile.exists()){
            createNewFile.mkdirs();
        }
        File forTransfer = new File(basePathToDir + "/" + fromFrontend.getFile().getOriginalFilename() );
        fromFrontend.getFile().transferTo(forTransfer);
    }
}
