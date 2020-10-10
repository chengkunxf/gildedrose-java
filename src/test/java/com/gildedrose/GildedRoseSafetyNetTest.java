package com.gildedrose;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.hamcrest.core.Is;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertThat;

public class GildedRoseSafetyNetTest {

    @Test
    public void should_get_baseline_equals_get_out_put_string() throws IOException {
        String baseline = Files.toString(new File("src/test/baseline.txt"), Charsets.UTF_8);
        assertThat(TextTestFixture.getOutput(), Is.is(baseline));
    }
}
