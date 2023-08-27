package validator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import com.example.usecase10.validator.RegexValidator;

public class RegexValidatorTest {

    public static class IsMatchingArgumentsProvider implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                Arguments.of("Aa1!", 4, true),
                Arguments.of("Aa1!Bb2@", 8, true),
                Arguments.of("Aa1!Bb2@", 7, false),
                Arguments.of("AA1!", 4, false),
                Arguments.of("aa1!", 4, false),
                Arguments.of("AaA!", 4, false),
                Arguments.of("Aa1 ", 4, false),
                Arguments.of(" Aa1!", 5, false),
                Arguments.of("Aa1!", 3, false),
                Arguments.of("", 10, false),
                Arguments.of(null, 10, false),
                Arguments.of("%$####", null, false),
                Arguments.of("Aa1!", null, true),
                Arguments.of("59Jn=", 15, true),
                Arguments.of("59Jn=", 1, false),
                Arguments.of("59 Jn=", 0, false)
            );
        }
    }

    @ParameterizedTest
    @ArgumentsSource(IsMatchingArgumentsProvider.class)
    public void testIsMatching(String string, Integer length, Boolean expectedResult) {
        RegexValidator validator = new RegexValidator();
        Boolean result = validator.IsMatching(string, length);
        assertEquals(expectedResult, result);
    }
}