/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.incremental;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("jps/jps-plugin/testData/incremental/mpp/allPlatforms")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IncrementalK1JsLegacyMultiplatformJsCompilerRunnerTestGenerated extends AbstractIncrementalK1JsLegacyMultiplatformJsCompilerRunnerTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInAllPlatforms() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/mpp/allPlatforms"), Pattern.compile("^([^\\.]+)$"), null, true);
    }

    @TestMetadata("touchActual")
    public void testTouchActual() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/mpp/allPlatforms/touchActual/");
    }

    @TestMetadata("touchExpect")
    public void testTouchExpect() throws Exception {
        runTest("jps/jps-plugin/testData/incremental/mpp/allPlatforms/touchExpect/");
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/mpp/allPlatforms/touchActual")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TouchActual extends AbstractIncrementalK1JsLegacyMultiplatformJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInTouchActual() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/mpp/allPlatforms/touchActual"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }

    @TestMetadata("jps/jps-plugin/testData/incremental/mpp/allPlatforms/touchExpect")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TouchExpect extends AbstractIncrementalK1JsLegacyMultiplatformJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInTouchExpect() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/mpp/allPlatforms/touchExpect"), Pattern.compile("^([^\\.]+)$"), null, true);
        }
    }
}
