package eu.nets.queue.peppol.persistence.repositories;

import eu.nets.queue.peppol.persistence.entities.PeppolDocumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PeppolRepository extends JpaRepository<PeppolDocumentEntity, Long> {

    @Query(value = "UPDATE", nativeQuery = true)
    public void updateQueueStatus(List<String> ids, String status);

}
