/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlinx.serialization.runners;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlinx.serialization.TestGeneratorKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/kotlinx-serialization/testData/boxIr")
@TestDataPath("$PROJECT_ROOT")
public class SerializationFirJsBoxTestGenerated extends AbstractSerializationFirJsBoxTest {
    @Test
    public void testAllFilesPresentInBoxIr() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/kotlinx-serialization/testData/boxIr"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("constValInSerialName.kt")
    public void testConstValInSerialName() throws Exception {
        runTest("plugins/kotlinx-serialization/testData/boxIr/constValInSerialName.kt");
    }

    @Test
    @TestMetadata("delegatedProperty.kt")
    public void testDelegatedProperty() throws Exception {
        runTest("plugins/kotlinx-serialization/testData/boxIr/delegatedProperty.kt");
    }

    @Test
    @TestMetadata("excludedFromExport.kt")
    public void testExcludedFromExport() throws Exception {
        runTest("plugins/kotlinx-serialization/testData/boxIr/excludedFromExport.kt");
    }

    @Test
    @TestMetadata("excludedFromFileExport.kt")
    public void testExcludedFromFileExport() throws Exception {
        runTest("plugins/kotlinx-serialization/testData/boxIr/excludedFromFileExport.kt");
    }

    @Test
    @TestMetadata("interfaces.kt")
    public void testInterfaces() throws Exception {
        runTest("plugins/kotlinx-serialization/testData/boxIr/interfaces.kt");
    }

    @Test
    @TestMetadata("serializerFactory.kt")
    public void testSerializerFactory() throws Exception {
        runTest("plugins/kotlinx-serialization/testData/boxIr/serializerFactory.kt");
    }

    @Test
    @TestMetadata("serializerFactoryInUserDefined.kt")
    public void testSerializerFactoryInUserDefined() throws Exception {
        runTest("plugins/kotlinx-serialization/testData/boxIr/serializerFactoryInUserDefined.kt");
    }
}
