package bigcode.repository.sourcecode.model;

public final class ContentHash {

	private final HashType type;
	private final String value;
	
	public ContentHash(HashType type, String value) {
		this.type = type;
		this.value = value;
	}
	
	public static ContentHash parse(String stringValue) {
		return new ContentHash(HashType.SHA256, stringValue);
	}

	@Override
	public String toString() {
		return type + ":" + value;
	}

	public HashType getType() {
		return type;
	}

	public String getValue() {
		return value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		ContentHash other = (ContentHash) obj;
		if (type != other.type)
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
}
