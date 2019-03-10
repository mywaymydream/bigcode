package bigcode.repository.sourcecode.model;

public final class SnapshotId {

	private final String value;

	public SnapshotId(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SnapshotId other = (SnapshotId) obj;
		return true;
	}
	
	
	
}
