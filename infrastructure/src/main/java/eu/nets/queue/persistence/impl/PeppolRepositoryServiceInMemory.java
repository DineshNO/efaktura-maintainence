package eu.nets.queue.persistence.impl;

import eu.nets.queue.peppol.domain.DocumentStatus;
import eu.nets.queue.peppol.ports.PeppolRepositoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.util.List;

import static java.lang.String.format;
import static java.nio.file.Files.write;
import static java.nio.file.Paths.get;
import static java.util.stream.Collectors.toList;

@RequiredArgsConstructor
@Log4j2
public class PeppolRepositoryServiceInMemory implements PeppolRepositoryService {

    private final String outPath;

    @Override
    public void resetPeppolQueue(final List<String> peppolIds, final DocumentStatus status) {
        List<String> scripts = peppolIds.stream()
                                        .map(id -> format("javascript:sendPeppolDocument(%s,'%s')", id,status))
                                        .collect(toList());
        try {
            write(get(outPath),scripts);
        } catch (IOException e) {
            log.error("Failed to write",e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void fetchPeppolQueueToReset(List<String> peppolIds, DocumentStatus status) {
        return;
    }
}
