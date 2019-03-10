package bigcode.repository.sourcecode.rest.dto;

import java.util.Collections;
import java.util.List;

public class ProjectDto {

	private String id;
	private List<String> repositories = Collections.emptyList();
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public List<String> getRepositories() {
		return repositories;
	}

	public void setRepositories(List<String> repositories) {
		this.repositories = repositories;
	}
	
	
}
