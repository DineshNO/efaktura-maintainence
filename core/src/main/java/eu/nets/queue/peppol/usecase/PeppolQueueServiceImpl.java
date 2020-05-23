package eu.nets.queue.peppol.usecase;

import eu.nets.queue.peppol.ports.PeppolRepositoryService;

import java.util.List;

import static eu.nets.queue.peppol.domain.DocumentStatus.*;

public class PeppolQueueServiceImpl implements PeppolQueueService {

    private PeppolRepositoryService peppolRepositoryService;

    public PeppolQueueServiceImpl(PeppolRepositoryService peppolRepositoryService) {
        this.peppolRepositoryService = peppolRepositoryService;
    }

    public void setPeppolQueueToInitial(List<String> peppolDocumentIds) {
        this.peppolRepositoryService.resetPeppolQueue(peppolDocumentIds, INITIAL);
    }

    public void setPeppolQueueToFailed(List<String> peppolDocumentIds) {
        this.peppolRepositoryService.resetPeppolQueue(peppolDocumentIds, FAILED);
    }

    public List<String> fetchFailedPeppolQueueToReset(List<String> peppolDocumentIds) {
        this.peppolRepositoryService.fetchPeppolQueueToReset(peppolDocumentIds, FAILED);
        return null;
    }

    public List<String> fetchBlockedPeppolQueueToReset(List<String> peppolDocumentIds) {
        this.peppolRepositoryService.fetchPeppolQueueToReset(peppolDocumentIds, BLOCKED);
        return null;
    }
}
