package eu.nets.queue.delivery.converters;

import eu.nets.queue.delivery.rest.PeppolResponse;
import eu.nets.queue.peppol.domain.DocumentStatus;
import eu.nets.queue.peppol.domain.PeppolDocument;
import eu.nets.queue.shared.RestConverter;

public class PeppolRestConverter implements RestConverter<PeppolResponse, PeppolDocument> {

    @Override
    public PeppolDocument mapToEntity(final PeppolResponse rest) {
        return new PeppolDocument(null, DocumentStatus.of(rest.getName()));
    }

    @Override
    public PeppolResponse mapToRest(final PeppolDocument entity) {
        return new PeppolResponse(entity.getPeppolId(), entity.getDocumentStatus().name());
    }

}
