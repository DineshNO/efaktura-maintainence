package eu.nets.queue.install.delivery.impl;


import eu.nets.queue.install.delivery.domain.InstallRequest;
import eu.nets.queue.install.delivery.InstallScriptController;
import eu.nets.queue.install.usecase.InstallVersionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequiredArgsConstructor
public class InstallScriptControllerImpl implements InstallScriptController {

    private final InstallVersionService installVersionService;

    @ResponseStatus(OK)
    @PostMapping(value = "/install", produces = APPLICATION_JSON_VALUE)
    public void fetchInstallScripts(@RequestBody InstallRequest installRequest) {
        this.installVersionService.fetchScripts(installRequest.getApplicationNames());
        return;
    }

}
