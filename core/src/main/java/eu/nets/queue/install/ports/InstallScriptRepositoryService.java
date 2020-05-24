package eu.nets.queue.install.ports;

import java.util.List;

public interface InstallScriptRepositoryService {

    List<String> fetchProdInstallVersions(List<String> applicationNames);

}
