package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueryStringTest {

    // 여러개일 경우 List<QueryString>
    @Test
    void createTest() {
        QueryString queryString = new QueryString("operand1", "11");
        assertThat(queryString).isNotNull();
    }
}
