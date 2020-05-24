package eu.nets.queue.peppol.configuration;

import eu.nets.queue.peppol.usecase.PeppolQueueServiceImpl;
import eu.nets.queue.peppol.persistence.impl.PeppolRepositoryServiceInMemory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("support")
public class RepositoryConfiguration {

    @Value("${out.file.path:output.txt}")
    private String outPath;

    @Bean
    public PeppolRepositoryServiceInMemory createPeppolServiceForSupport() {
        return new PeppolRepositoryServiceInMemory(outPath);
    }

    @Bean
    public PeppolQueueServiceImpl createPeppolQueueService() {
        return new PeppolQueueServiceImpl(createPeppolServiceForSupport());
    }

}
