package com.cts.test.suit;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"com.cts.test.packageA"
				,"com.cts.test.packageB"})
//@IncludeClassNamePatterns({"^.*ATests?$"})
@IncludeTags("production")
public class JUnit5TestSuiteExample {

}