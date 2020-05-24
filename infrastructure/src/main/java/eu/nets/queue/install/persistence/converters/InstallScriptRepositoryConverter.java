package eu.nets.queue.install.persistence.converters;

import eu.nets.queue.install.domain.InstallVersion;
import eu.nets.queue.install.persistence.entities.InstallVersionEntity;
import eu.nets.queue.shared.RepositoryConverter;

public class InstallScriptRepositoryConverter implements RepositoryConverter<InstallVersionEntity, InstallVersion> {

	@Override
	public InstallVersionEntity mapToTable(final InstallVersion persistenceObject) {
		return new InstallVersionEntity();
	}

	@Override
	public InstallVersion mapToEntity(final InstallVersionEntity entity) {
		return new InstallVersion(entity.getServerAddress(),entity.getEnvironment(),entity.getVersion());
	}
}
