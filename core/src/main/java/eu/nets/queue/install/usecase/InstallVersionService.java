package eu.nets.queue.install.usecase;

import java.util.List;

public interface InstallVersionService {

    public List<String> fetchScripts(List<String> applicationName);
}
