package eu.nets.queue.delivery.impl;


import eu.nets.queue.delivery.PeppolQueueController;
import eu.nets.queue.peppol.usecase.PeppolQueueService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/peppol")
@RequiredArgsConstructor
public class PeppolQueueControllerImpl implements PeppolQueueController {

    private final PeppolQueueService peppolQueueService;

    @ResponseStatus(OK)
    @PostMapping(value = "/initial", produces = APPLICATION_JSON_VALUE)
    public void fetchQueuesToInitial(@RequestBody List<String> ids) {
        this.peppolQueueService.setPeppolQueueToInitial(ids);
    }

    @ResponseStatus(OK)
    @PostMapping(value = "/failed", produces = APPLICATION_JSON_VALUE)
    public void fetchQueuesToFailed(@RequestBody List<String> ids) {
        this.peppolQueueService.setPeppolQueueToFailed(ids);
    }

    @ResponseStatus(OK)
    @GetMapping(value = "/blocked", produces = APPLICATION_JSON_VALUE)
    public void fetchQueuesToBlocked(@RequestBody List<String> ids) {
        this.peppolQueueService.setPeppolQueueToFailed(ids);
    }

}
