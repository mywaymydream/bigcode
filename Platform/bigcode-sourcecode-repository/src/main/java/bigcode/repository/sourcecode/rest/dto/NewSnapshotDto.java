package bigcode.repository.sourcecode.rest.dto;

import java.util.Collections;
import java.util.List;

public class NewSnapshotDto {

	private String snapshotHash;
	private Folder root;	
	
	public Folder getRoot() {
		return root;
	}

	public void setRoot(Folder root) {
		this.root = root;
	}
	
	public String getSnapshotHash() {
		return snapshotHash;
	}

	public void setSnapshotHash(String snapshotHash) {
		this.snapshotHash = snapshotHash;
	}

	public static class File {
		private String name;
		private String type;
		private String contentHash;
		private long size;
		
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
		public long getSize() {
			return size;
		}
		public void setSize(long size) {
			this.size = size;
		}
	}
	
	public static class Folder extends File {
		private List<Folder> subFolders = Collections.emptyList();
		private List<File> files = Collections.emptyList();
		public List<Folder> getSubFolders() {
			return subFolders;
		}
		public void setSubFolders(List<Folder> subFolders) {
			this.subFolders = subFolders;
		}
		public List<File> getFiles() {
			return files;
		}
		public void setFiles(List<File> files) {
			this.files = files;
		}		
		
	}
}
