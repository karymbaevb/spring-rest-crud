package kg.itacademy.client.service.impl;

import kg.itacademy.client.model.DocumentModel;
import kg.itacademy.client.repository.DocumentRepository;
import kg.itacademy.client.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DocumentServiceImpl implements DocumentService {
    @Autowired
    private DocumentRepository documentRepository;

    @Override
    public void createNewDocument(DocumentModel model) {

    }

    @Override
    public List<DocumentModel> getNewDocumentByClientId(Long clientId) {
        return null;
    }
}
