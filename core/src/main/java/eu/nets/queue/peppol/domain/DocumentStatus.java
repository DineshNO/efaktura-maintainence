package eu.nets.queue.peppol.domain;

import static java.util.Arrays.stream;

public enum DocumentStatus {
    INITIAL,FAILED,BLOCKED,RESEND;

    public static DocumentStatus of(String status){
        return stream(DocumentStatus.values())
                .filter(documentStatus -> documentStatus.name().equals(status))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
