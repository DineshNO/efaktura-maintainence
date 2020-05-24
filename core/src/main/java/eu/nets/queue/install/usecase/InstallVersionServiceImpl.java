package eu.nets.queue.install.usecase;

import eu.nets.queue.install.ports.InstallScriptRepositoryService;

import java.util.List;

public class InstallVersionServiceImpl implements InstallVersionService {

    private InstallScriptRepositoryService prodInstallVersionService;

    public InstallVersionServiceImpl(InstallScriptRepositoryService prodInstallVersionService) {
        this.prodInstallVersionService = prodInstallVersionService;
    }

    @Override
    public List<String> fetchScripts(List<String> applicationNames) {
        return prodInstallVersionService.fetchProdInstallVersions(applicationNames);
    }
}
