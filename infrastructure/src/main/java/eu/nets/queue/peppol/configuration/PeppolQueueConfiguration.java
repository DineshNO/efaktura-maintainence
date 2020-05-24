package eu.nets.queue.peppol.configuration;

import eu.nets.queue.peppol.usecase.PeppolQueueServiceImpl;
import eu.nets.queue.peppol.persistence.converters.PeppolRepositoryConverter;
import eu.nets.queue.peppol.persistence.impl.PeppolServiceImpl;
import eu.nets.queue.peppol.persistence.repositories.PeppolRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class PeppolQueueConfiguration {

    @Bean
    public PeppolRepositoryConverter createPeppolRepositoryConverter() {
        return new PeppolRepositoryConverter();
    }

    @Bean
    public PeppolServiceImpl createPeppolService(PeppolRepository peppolRepository) {
        return new PeppolServiceImpl(peppolRepository, createPeppolRepositoryConverter());
    }

    @Bean
    public PeppolQueueServiceImpl createPeppolQueueService(PeppolRepository peppolRepository) {
        return new PeppolQueueServiceImpl(createPeppolService(peppolRepository));
    }

}
