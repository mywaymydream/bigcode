package bigcode.repository.sourcecode.rest.dto;

import java.util.Collections;
import java.util.List;

public class FilesListDto {

	private String projectId;
	private String repositoryId;
	private String snapshotId;
	private String path;
	private List<FileDto> files = Collections.emptyList();
	
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
	
	public List<FileDto> getFiles() {
		return files;
	}
	
	public void setFiles(List<FileDto> files) {
		this.files = files;
	}
	
}
