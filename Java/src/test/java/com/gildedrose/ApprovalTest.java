package com.gildedrose;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApprovalTest {

	@Test
    void testNormalJunit()
    {
        assertEquals(5, 5);
    }
    @Test
    void testWithApprovalTests()
    {
        Approvals.verify(TexttestFixture.run("30"));
    }
}
