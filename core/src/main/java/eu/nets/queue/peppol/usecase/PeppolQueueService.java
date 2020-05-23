package eu.nets.queue.peppol.usecase;

import java.util.List;

public interface PeppolQueueService {

    void setPeppolQueueToInitial(List<String> peppolDocumentIds);

    void setPeppolQueueToFailed(List<String> peppolDocumentIds);

    List<String> fetchFailedPeppolQueueToReset(List<String> peppolDocumentIds);

    List<String> fetchBlockedPeppolQueueToReset(List<String> peppolDocumentIds);
}
