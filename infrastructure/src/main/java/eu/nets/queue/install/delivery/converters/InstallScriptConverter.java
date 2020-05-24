package eu.nets.queue.install.delivery.converters;

import eu.nets.queue.install.delivery.rest.InstallScriptResponse;
import eu.nets.queue.install.domain.InstallVersion;
import eu.nets.queue.shared.RestConverter;

public class InstallScriptConverter implements RestConverter<InstallScriptResponse, InstallVersion> {

    @Override
    public InstallVersion mapToEntity(final InstallScriptResponse rest) {
        return new InstallVersion(null, null,null);
    }

    @Override
    public InstallScriptResponse mapToRest(final InstallVersion InstallVersion) {
        return new InstallScriptResponse();
    }


}
