package bigcode.repository.sourcecode.rest.dto;

import java.util.Collections;
import java.util.List;

public class RepositoryDto {
    
    private String id;
    private String projectId;
    private RepositoryProperties properties;
    private List<String> snapshots = Collections.emptyList();
    
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
    
    public RepositoryProperties getProperties() {
        return properties;
    }
    
    public void setProperties(RepositoryProperties properties) {
        this.properties = properties;
    }
    
    public List<String> getSnapshots() {
        return snapshots;
    }
    
    public void setSnapshots(List<String> snapshots) {
        this.snapshots = snapshots;
    }
    
    public static class RepositoryProperties {
        private Integer maxSnapshotsCount;
        
        public Integer getMaxSnapshotsCount() {
            return maxSnapshotsCount;
        }
        
        public void setMaxSnapshotsCount(Integer maxSnapshotsCount) {
            this.maxSnapshotsCount = maxSnapshotsCount;
        }
        
    }
    
}
