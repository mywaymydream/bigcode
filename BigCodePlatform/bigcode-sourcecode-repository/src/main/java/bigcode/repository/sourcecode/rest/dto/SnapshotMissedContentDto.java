package bigcode.repository.sourcecode.rest.dto;

import java.util.Collections;
import java.util.List;

public class SnapshotMissedContentDto {
    
    private String projectId;
    private String repositoryId;
    private String snapshotId;
    private List<String> contentHashes = Collections.emptyList();
    
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
    
    public List<String> getContentHashes() {
        return contentHashes;
    }
    
    public void setContentHashes(List<String> contentHashes) {
        this.contentHashes = contentHashes;
    }
    
}
