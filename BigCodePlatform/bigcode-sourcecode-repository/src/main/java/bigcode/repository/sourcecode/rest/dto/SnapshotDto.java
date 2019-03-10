package bigcode.repository.sourcecode.rest.dto;

import java.time.LocalDate;

public class SnapshotDto {

	private String id;
	private LocalDate createdDate;
	private Long totalSize;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public Long getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	
}
