package com.certif.testing.springunittests;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;

class GraderTest {
    private static final String EXCEPTION_TEXT = "The grade should be in this interval: [0, 20]";
    private static final String LOW_EFFORT = "Low effort";
    private static final String MAKE_SOME_EFFORT = "You can do it, just make some effort";
    private static final String NICE_JOB = "Nice job! you can do more.";
    private static final String AMAZING_GRADE = "You are amazing!";
    private Grader grader = new Grader();

    @Test
    void itShouldThrowPrintIllegalArgumentException() {
        // Verify that it will throw an exception if the grade is under 0
        assertThatThrownBy(() -> {
            grader.grade(-2);
        })
                .isInstanceOf(IllegalArgumentException.class)
                        .hasMessageContaining(EXCEPTION_TEXT);
        // Verify that it will throw an exception if the grade is strict greater than 20
        assertThrows(IllegalArgumentException.class, () -> {
            grader.grade(21);
        });
    }

    @Test
    void itShouldPrintLowEffort() {
        assertThat(grader.grade(4))
                .isEqualTo(LOW_EFFORT);
    }

    @Test
    void itShouldPrintMakeSomeEffort() {
        assertThat(grader.grade(6))
                .isEqualTo(MAKE_SOME_EFFORT);
    }

    @Test
    void itShouldPrintNiceJob() {
        assertThat(grader.grade(14))
                .isEqualTo(NICE_JOB);
    }
    @Test
    void itShouldPrintYouAreAmazing() {
        assertThat(grader.grade(18))
                .isEqualTo(AMAZING_GRADE);
    }
}