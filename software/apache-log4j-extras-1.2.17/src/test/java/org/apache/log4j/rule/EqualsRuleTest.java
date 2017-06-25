/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.log4j.rule;


import junit.framework.TestCase;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.util.SerializationTestHelper;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Stack;

/**
 * Test for EqualsRule.
 */
public class EqualsRuleTest extends TestCase {

    /**
     * Create new test.
     *
     * @param testName test name.
     */
    public EqualsRuleTest(final String testName) {
        super(testName);
    }

    /**
     * getRule() with only one entry on stack should throw IllegalArgumentException.
     */
    public void test1() {
        Stack stack = new Stack();
        stack.push("Hello");
        try {
            EqualsRule.getRule(stack);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
        }
    }

    /**
     * getRule() with bad field name should throw IllegalArgumentException.
     */
    public void test2() {
        Stack stack = new Stack();
        stack.push("Hello");
        stack.push("World");
        try {
            EqualsRule.getRule(stack);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
        }
    }

    /**
     * getRule with "level" and "info" should return a LevelEqualsRule.
     */
    public void test3() {
        Stack stack = new Stack();
        stack.push("level");
        stack.push("info");
        Rule rule = EqualsRule.getRule(stack);
        assertEquals(0, stack.size());
        assertTrue(rule instanceof LevelEqualsRule);
        LoggingEvent event = new LoggingEvent("org.apache.log4j.Logger",
                Logger.getRootLogger(), System.currentTimeMillis(), Level.INFO,
                "Hello, World", null);
        assertTrue(rule.evaluate(event, null));
    }

    /**
     * getRule with "timestamp" and time should return a TimestampEqualsRule.
     */
    public void test4() {
        Stack stack = new Stack();
        stack.push("timestamp");
        stack.push("2008/05/21 00:45:44");
        Rule rule = EqualsRule.getRule(stack);
        assertEquals(0, stack.size());
        assertTrue(rule instanceof TimestampEqualsRule);
        Calendar cal = new GregorianCalendar(2008, 04, 21, 00, 45, 44);
        LoggingEvent event = new LoggingEvent("org.apache.log4j.Logger",
                Logger.getRootLogger(), cal.getTimeInMillis(), Level.INFO,
                "Hello, World", null);
        assertTrue(rule.evaluate(event, null));
    }

    /**
     * getRule with "msg" should return an EqualsRule.
     */
    public void test5() {
        Stack stack = new Stack();
        stack.push("msg");
        stack.push("Hello, World");
        Rule rule = EqualsRule.getRule(stack);
        assertEquals(0, stack.size());
        LoggingEvent event = new LoggingEvent("org.apache.log4j.Logger",
                Logger.getRootLogger(), System.currentTimeMillis(), Level.INFO,
                "Hello, World", null);
        assertTrue(rule.evaluate(event, null));
    }

    /**
     * getRule with "msg" should return an EqualsRule.
     */
    public void test6() {
        Stack stack = new Stack();
        stack.push("msg");
        stack.push("Bonjour, Monde");
        Rule rule = EqualsRule.getRule(stack);
        assertEquals(0, stack.size());
        LoggingEvent event = new LoggingEvent("org.apache.log4j.Logger",
                Logger.getRootLogger(), System.currentTimeMillis(), Level.INFO,
                "Hello, World", null);
        assertFalse(rule.evaluate(event, null));
    }

    /**
     * Check EqualsRule serialization.
     */
    public void test7() throws IOException, ClassNotFoundException {
        Stack stack = new Stack();
        stack.push("msg");
        stack.push("Hello, World");
        Rule rule = (Rule) SerializationTestHelper.serializeClone(EqualsRule.getRule(stack));
        assertEquals(0, stack.size());
        LoggingEvent event = new LoggingEvent("org.apache.log4j.Logger",
                Logger.getRootLogger(), System.currentTimeMillis(), Level.INFO,
                "Hello, World", null);
        assertTrue(rule.evaluate(event, null));
    }

}
