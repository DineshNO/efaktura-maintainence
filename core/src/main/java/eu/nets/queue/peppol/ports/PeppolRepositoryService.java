package eu.nets.queue.peppol.ports;

import eu.nets.queue.peppol.domain.DocumentStatus;

import java.util.List;

public interface PeppolRepositoryService {

    void resetPeppolQueue(List<String> peppolIds, DocumentStatus status);

    void fetchPeppolQueueToReset(List<String> peppolIds, DocumentStatus status);
}
