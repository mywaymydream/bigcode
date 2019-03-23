package bigcode.repository.sourcecode.model;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.jupiter.api.Test;

public class ContentHashTest {

	
	@Test
	public void createNew256Hashcode() {
		//given
		String hashcode = sha256("Test value");
		//when
		ContentHash testInstance = new ContentHash(HashType.SHA256, hashcode);
		//then
		assertEquals(HashType.SHA256, testInstance.getType());
		assertEquals(hashcode, testInstance.getValue());
		assertEquals("sha256:" + hashcode, testInstance.toString());
	}
	
	@Test
	public void equaledObjectsWithTheSameHashType() {
		//given
		ContentHash contentHash2 = new ContentHash(HashType.SHA256, sha256("Test value"));
		ContentHash contentHash1 = new ContentHash(HashType.SHA256, sha256("Test value"));
		//then
		assertTrue(contentHash1.equals(contentHash2));
		assertTrue(contentHash2.equals(contentHash1));
		assertEquals(contentHash1.hashCode(), contentHash2.hashCode());
	}
	
	@Test
	public void diffentObjectsWithTheSameHashType() {
		//given
		ContentHash contentHash2 = new ContentHash(HashType.SHA256, sha256("Test value 2"));
        ContentHash contentHash1 = new ContentHash(HashType.SHA256, sha256("Test value 1"));
		//then
		assertFalse(contentHash1.equals(contentHash2));
		assertFalse(contentHash2.equals(contentHash1));
		assertNotEquals(contentHash1.hashCode(), contentHash2.hashCode());
	}
	
	@Test
	public void typeCanNotBeNull() {
		//given
		String hashcode = sha256("Test value");
		//then
		assertThrows(NullPointerException.class, 
				     () -> new ContentHash(null, hashcode));
	}
	
	@Test
	public void valueCanNotBeNull() {
		assertThrows(NullPointerException.class, 
				     () -> new ContentHash(HashType.SHA256, null));
	}
	
	private static String sha256(String value) {
		return DigestUtils.sha256Hex(value);
	}
}
