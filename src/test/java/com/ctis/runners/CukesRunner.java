package com.ctis.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {//"pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"},
        features = "src/test/resources/features",
        glue = "com/ctis/step_definitions",
        dryRun = false,
        tags = "@CTSL10-478 or @CTSL10-479 or @CTSL10-480 or @CTSL10-481",
        publish = true
)
public class CukesRunner {
}

