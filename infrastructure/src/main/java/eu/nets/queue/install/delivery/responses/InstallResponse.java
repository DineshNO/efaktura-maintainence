package eu.nets.queue.install.delivery.responses;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class InstallResponse<T> implements Serializable {

	private final String status;
	private final String code;
	private final String message;
	private final T data;

	private static final long serialVersionUID = 7302319210373510173L;

}
