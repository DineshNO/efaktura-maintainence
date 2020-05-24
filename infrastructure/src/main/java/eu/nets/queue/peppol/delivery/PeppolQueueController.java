package eu.nets.queue.peppol.delivery;

import java.util.List;

public interface PeppolQueueController {

	void fetchQueuesToInitial(List<String> ids);

	void fetchQueuesToBlocked(List<String> ids);

}
