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
    public void should_output_string_equals_base_line_string() throws IOException {
        String baseline = Files.toString(new File("src/test/baseline.txt"), Charsets.UTF_8);
        assertThat(TextTestFixture.getBaseLine(), Is.is(baseline));
    }
}
