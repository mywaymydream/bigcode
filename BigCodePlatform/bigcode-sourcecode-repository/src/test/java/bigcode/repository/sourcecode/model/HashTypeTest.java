package bigcode.repository.sourcecode.model;

import static org.apache.commons.codec.digest.DigestUtils.sha256Hex;
import static org.apache.commons.codec.digest.DigestUtils.sha512Hex;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class HashTypeTest {

    @ParameterizedTest(name = "Algorithm ''{0}'' has name ''{1}''")
    @MethodSource("allExpectedAlgorithmNames")
    public void algorithNames(HashType testInstance, String expectedAlgorithmName) {
        assertEquals(expectedAlgorithmName, testInstance.getAlgorithmName());
    }

    @ParameterizedTest
    @MethodSource("validHashCodes")
    public void valideHashcodes(HashType testInstance, String hashCode) {
        assertTrue(testInstance.validate(hashCode));
    }

    @ParameterizedTest
    @MethodSource("invalidHashCodes")
    public void validateHashcodes_negative(HashType testInstance, String hashCode) {
        assertFalse(testInstance.validate(hashCode));
    }

    private static Stream<Arguments> allExpectedAlgorithmNames() {
        return Stream.of(
                         of(HashType.SHA256, "sha256"),
                         of(HashType.SHA512, "sha512"));
    }

    private static Stream<Arguments> validHashCodes() {
        return Stream.of(
                         of(HashType.SHA256, sha256Hex("value").toUpperCase()),
                         of(HashType.SHA256, sha256Hex("value").toLowerCase()),
                         of(HashType.SHA512, sha512Hex("value").toUpperCase()),
                         of(HashType.SHA512, sha512Hex("value").toLowerCase()));
    }

    private static Stream<Arguments> invalidHashCodes() {
        return Stream.of(
                         of(HashType.SHA256, null),
                         of(HashType.SHA256, ""),
                         of(HashType.SHA256, "Some text string"),
                         of(HashType.SHA256, sha256Hex("value").substring(0, 63)),

                         of(HashType.SHA512, null),
                         of(HashType.SHA512, ""),
                         of(HashType.SHA512, "Some text string"),
                         of(HashType.SHA512, sha512Hex("value").substring(0, 63))

        );

    }
}
