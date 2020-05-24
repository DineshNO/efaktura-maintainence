package eu.nets.queue.install.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class InstallVersion implements Serializable {
    private final String server;
    private final String applicationName;
    private final String version;
}
