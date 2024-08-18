package com.cts.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
//@SelectPackages({"com.cts.test.packageA","com.cts.test.packageB"}) //specifies the names of packages to select when running a test suite via and causes all it’s sub-packages as well to be scanned for test classes.
//@IncludePackages("com.cts.test")
@ExcludePackages("com.cts.test.packageC")
public class JUnit5TestSuite {

}
