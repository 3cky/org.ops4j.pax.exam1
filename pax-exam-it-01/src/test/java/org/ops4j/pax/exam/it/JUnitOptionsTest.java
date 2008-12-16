/*
 * Copyright 2008 Alin Dreghiciu
 *
 * Licensed  under the  Apache License,  Version 2.0  (the "License");
 * you may not use  this file  except in  compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed  under the  License is distributed on an "AS IS" BASIS,
 * WITHOUT  WARRANTIES OR CONDITIONS  OF ANY KIND, either  express  or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.exam.it;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.ops4j.pax.exam.CoreOptions.*;
import org.ops4j.pax.exam.Option;
import static org.ops4j.pax.exam.container.def.PaxRunnerOptions.*;
import org.ops4j.pax.exam.junit.Configuration;
import static org.ops4j.pax.exam.junit.JUnitOptions.*;
import org.ops4j.pax.exam.junit.OsgiTestRunner;

/**
 * JUnit options integration tests.
 *
 * @author Alin Dreghiciu (adreghiciu@gmail.com)
 * @since 0.3.0, November 17, 2008
 */
@RunWith( OsgiTestRunner.class )
public class JUnitOptionsTest
{

    /**
     * Pax Exam test options that adds a log profile.
     * Valid for all test methods.
     *
     * @return test options
     */
    @Configuration
    public Option[] configure()
    {
        return options(
            logProfile()
        );
    }

    @Configuration( "junitBundlesSpecified" )
    public Option[] configureAnotherVersionOfJUnit()
    {
        return options(
            junitBundles().version( "4.5.0" )
        );
    }

    /**
     * Tests that the provisioned JUnit bundles are the default ones (4.4.0).
     */
    @Test
    public void junitBundlesNotSpecified()
    {
        // TODO what we can test here?
    }

    /**
     * Tests that the provisioned JUnit bundles are the specified ones (4.5.0).
     */
    @Test
    public void junitBundlesSpecified()
    {
        // TODO what we can test here?
    }

}