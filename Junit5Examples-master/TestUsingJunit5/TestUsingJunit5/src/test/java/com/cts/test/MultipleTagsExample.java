package com.cts.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.junit5.examples")
@IncludeTags("dev")
@ExcludeTags({"prod","sit"})
public class MultipleTagsExample {

}
