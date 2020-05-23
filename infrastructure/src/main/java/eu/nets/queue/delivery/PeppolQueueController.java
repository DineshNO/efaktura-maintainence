package eu.nets.queue.delivery;

import java.util.List;

public interface PeppolQueueController {

	void fetchQueuesToInitial(List<String> ids);

	void fetchQueuesToBlocked(List<String> ids);

}
