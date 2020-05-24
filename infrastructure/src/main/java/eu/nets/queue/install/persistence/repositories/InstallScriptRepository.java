package eu.nets.queue.install.persistence.repositories;

import eu.nets.queue.install.persistence.entities.InstallVersionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InstallScriptRepository extends JpaRepository<InstallVersionEntity, Long> {

    @Query(value = "SELECT", nativeQuery = true)
    public List<String> fetchInstalledProdVersion(List<String> applicationNames);

}
