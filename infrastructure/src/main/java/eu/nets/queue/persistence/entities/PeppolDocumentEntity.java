package eu.nets.queue.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PEPPOL_DOCUMENT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PeppolDocumentEntity implements Serializable {

	private static final long serialVersionUID = 4471777119419172870L;

	@Id
	private String id;

	@Column(name = "DOCUMENT_STATUS", unique = true)
	private String documentStatus;

}
