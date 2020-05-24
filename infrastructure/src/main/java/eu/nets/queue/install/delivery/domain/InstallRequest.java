package eu.nets.queue.install.delivery.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Data
public class InstallRequest {
    private  final EnvironmentEnum environment;
    private final List<String> applicationNames;
}
