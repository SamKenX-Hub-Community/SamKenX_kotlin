/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.test.generators.GenerateCompilerTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/customScript")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IrCustomScriptCodegenTestGenerated extends AbstractIrCustomScriptCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInCustomScript() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/customScript"), Pattern.compile("^(.*)$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("captureImplicitReceiverInDefaultValue.kts")
    public void testCaptureImplicitReceiverInDefaultValue_kts() throws Exception {
        runTest("compiler/testData/codegen/customScript/captureImplicitReceiverInDefaultValue.kts");
    }

    @TestMetadata("pathPattern5.kts")
    public void testPathPattern5_kts() throws Exception {
        runTest("compiler/testData/codegen/customScript/pathPattern5.kts");
    }

    @TestMetadata("providedPropsInLambda.kts")
    public void testProvidedPropsInLambda_kts() throws Exception {
        runTest("compiler/testData/codegen/customScript/providedPropsInLambda.kts");
    }

    @TestMetadata("simpleEnvVars.kts")
    public void testSimpleEnvVars_kts() throws Exception {
        runTest("compiler/testData/codegen/customScript/simpleEnvVars.kts");
    }

    @TestMetadata("simple.customext")
    public void testSimple_customext() throws Exception {
        runTest("compiler/testData/codegen/customScript/simple.customext");
    }

    @TestMetadata("stringReceiver.kts")
    public void testStringReceiver_kts() throws Exception {
        runTest("compiler/testData/codegen/customScript/stringReceiver.kts");
    }
}
