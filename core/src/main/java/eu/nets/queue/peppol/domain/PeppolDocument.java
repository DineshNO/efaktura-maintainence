package eu.nets.queue.peppol.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class PeppolDocument implements Serializable {
    private final String peppolId;
    private final DocumentStatus documentStatus;
}
