package eu.nets.queue.persistence.impl;

import eu.nets.queue.peppol.domain.DocumentStatus;
import eu.nets.queue.peppol.ports.PeppolRepositoryService;
import eu.nets.queue.persistence.converters.PeppolRepositoryConverter;
import eu.nets.queue.persistence.repositories.PeppolRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class PeppolServiceImpl implements PeppolRepositoryService {

	private final PeppolRepository peppolRepository;

	private final PeppolRepositoryConverter peppolRepositoryConverter;

	@Override
	public void resetPeppolQueue(List<String> peppolIds, DocumentStatus status) {
		peppolRepository.updateQueueStatus(peppolIds,status.name());
	}

	@Override
	public void fetchPeppolQueueToReset(List<String> peppolIds, DocumentStatus status) {
		peppolRepository.updateQueueStatus(peppolIds,status.name());
	}
}
