package eu.nets.queue.persistence.converters;

import eu.nets.queue.peppol.domain.PeppolDocument;
import eu.nets.queue.persistence.entities.PeppolDocumentEntity;
import eu.nets.queue.shared.RepositoryConverter;

import static eu.nets.queue.peppol.domain.DocumentStatus.of;

public class PeppolRepositoryConverter implements RepositoryConverter<PeppolDocumentEntity, PeppolDocument> {

	@Override
	public PeppolDocumentEntity mapToTable(final PeppolDocument persistenceObject) {
		return new PeppolDocumentEntity(persistenceObject.getPeppolId(), persistenceObject.getDocumentStatus().name());
	}

	@Override
	public PeppolDocument mapToEntity(final PeppolDocumentEntity entityObject) {
		return new PeppolDocument(entityObject.getId(), of(entityObject.getDocumentStatus()));
	}
}
