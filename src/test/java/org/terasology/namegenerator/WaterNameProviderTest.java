/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.namegenerator;

import static org.junit.Assert.assertFalse;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.terasology.HeadlessEnvironment;
import org.terasology.namegenerator.waters.WaterNameProvider;

/**
 * Tests {@link WaterNameProvider}
 * @author Martin Steiger
 */
public class WaterNameProviderTest {

    private static HeadlessEnvironment env;

    /**
     * Setup headless environment
     */
    @BeforeClass
    public static void setUpClass() {
        env = new HeadlessEnvironment();
        env.activateAllModules();
    }

    /**
     * Clean up
     * @throws Exception never
     */
    @AfterClass
    public static void tearDownClass() throws Exception {
        env.close();
    }
    
    /**
     * A very simple test
     */
    @Test
    public void testBase() {
        
        WaterNameProvider prov = new WaterNameProvider(123455);
        
        for (int i = 0; i < 100; i++) {
            String name = prov.generateName();
            assertFalse(name.isEmpty());
        }
    }
    
}
