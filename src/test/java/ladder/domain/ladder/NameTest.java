package ladder.domain.ladder;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NameTest {

    @Test
    @DisplayName("상금 이름 객체 생성")
    void construct() throws Exception {
        //given
        String name = "name";

        //when
        Name actual = new Name(name);

        //then
        assertThat(actual).isEqualTo(new Name(name));
    }

    @ParameterizedTest(name = "상금 이름 객체 생성 예외 {index} [{arguments}]")
    @MethodSource
    @DisplayName("상금 이름 객체 생성 예외")
    void construct_exception(String name) throws Exception {
        //given

        //when
        ThrowableAssert.ThrowingCallable actual = () -> new Name(name);

        //then
        assertThatThrownBy(actual).isInstanceOf(AwardNameException.class)
                .hasMessage("상금은 1~5자만 가능합니다.");
    }

    private static Stream<Arguments> construct_exception() {
        return Stream.of(
                Arguments.of((String) null),
                Arguments.of(""),
                Arguments.of(" "),
                Arguments.of("too long name")
        );
    }

}
