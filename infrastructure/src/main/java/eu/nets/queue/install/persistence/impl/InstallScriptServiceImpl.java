package eu.nets.queue.install.persistence.impl;

import eu.nets.queue.install.persistence.converters.InstallScriptRepositoryConverter;
import eu.nets.queue.install.persistence.repositories.InstallScriptRepository;
import eu.nets.queue.install.ports.InstallScriptRepositoryService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class InstallScriptServiceImpl implements InstallScriptRepositoryService {

	private final InstallScriptRepository installScriptRepository;

	private final InstallScriptRepositoryConverter installScriptRepositoryConverter;

	@Override
	public List<String> fetchProdInstallVersions(List<String> applicationNames) {
		List<String> strings = this.installScriptRepository.fetchInstalledProdVersion(applicationNames);
		return null;
	}
}
