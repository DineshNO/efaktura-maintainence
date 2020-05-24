package eu.nets.queue.install.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "VERSION")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstallVersionEntity implements Serializable {

	private static final long serialVersionUID = 4471777119419172870L;

	@Id
	private String id;

	@Column(name = "DOCUMENT_STATUS", unique = true)
	private String serverAddress;

	@Column(name = "ENVIRONMENT", unique = true)
	private String environment;

	@Column(name = "VERSION", unique = true)
	private String version;

}
