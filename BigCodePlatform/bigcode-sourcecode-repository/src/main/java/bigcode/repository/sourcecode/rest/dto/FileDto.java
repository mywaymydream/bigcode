package bigcode.repository.sourcecode.rest.dto;

public class FileDto {

	private String projectId;
	private String repositoryId;
	private String snapshotId;
	private String id;
	private String path;
	private String name;
	private String type;
	private String contentHash;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProjectId() {
		return projectId;
	}
	
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	
	public String getRepositoryId() {
		return repositoryId;
	}
	
	public void setRepositoryId(String repositoryId) {
		this.repositoryId = repositoryId;
	}
	
	public String getSnapshotId() {
		return snapshotId;
	}
	
	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getContentHash() {
		return contentHash;
	}
	
	public void setContentHash(String contentHash) {
		this.contentHash = contentHash;
	}
	

	
}
