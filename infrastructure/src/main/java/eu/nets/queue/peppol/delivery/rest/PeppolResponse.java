package eu.nets.queue.peppol.delivery.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PeppolResponse implements Serializable {

	private static final long serialVersionUID = 7809559376441998463L;

	@NotNull
	private String name;

	@NotNull
	private String available;
}
