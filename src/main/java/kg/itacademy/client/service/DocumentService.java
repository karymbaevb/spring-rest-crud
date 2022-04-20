package kg.itacademy.client.service;

import kg.itacademy.client.model.DocumentModel;

import java.util.List;

public interface DocumentService {
    void createNewDocument(DocumentModel model);
    List<DocumentModel> getNewDocumentByClientId(Long clientId);
}
