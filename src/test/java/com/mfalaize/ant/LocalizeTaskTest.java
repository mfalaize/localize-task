/*
 * Copyright 2013 Maxime Falaize.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mfalaize.ant;

import org.apache.tools.ant.BuildFileTest;

/**
 * Test class for the localize ant task.
 *
 * @author Maxime Falaize
 */
public class LocalizeTaskTest extends BuildFileTest {

    public LocalizeTaskTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        configureProject("src/test/resources/build.xml");
    }

    /**
     * Test of execute method, of class LocalizeTask.
     */
    public void testExecute() {
        executeTarget("test");
    }
}
