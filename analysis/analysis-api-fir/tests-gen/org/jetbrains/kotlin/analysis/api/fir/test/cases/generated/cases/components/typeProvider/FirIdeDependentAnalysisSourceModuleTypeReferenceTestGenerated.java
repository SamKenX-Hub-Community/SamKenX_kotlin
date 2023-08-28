/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.typeProvider;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fir.test.configurators.AnalysisApiFirTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.typeProvider.AbstractTypeReferenceTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/typeProvider/typeReference")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeDependentAnalysisSourceModuleTypeReferenceTestGenerated extends AbstractTypeReferenceTest {
    @NotNull
    @Override
    public AnalysisApiTestConfigurator getConfigurator() {
        return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
            new AnalysisApiTestConfiguratorFactoryData(
                FrontendKind.Fir,
                TestModuleKind.Source,
                AnalysisSessionMode.Dependent,
                AnalysisApiMode.Ide
            )
        );
    }

    @Test
    public void testAllFilesPresentInTypeReference() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/typeProvider/typeReference"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("annotationEntry.kt")
    public void testAnnotationEntry() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeProvider/typeReference/annotationEntry.kt");
    }

    @Test
    @TestMetadata("annotationEntryBackingField.kt")
    public void testAnnotationEntryBackingField() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeProvider/typeReference/annotationEntryBackingField.kt");
    }

    @Test
    @TestMetadata("annotationEntryGetter.kt")
    public void testAnnotationEntryGetter() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeProvider/typeReference/annotationEntryGetter.kt");
    }

    @Test
    @TestMetadata("annotationEntryOnParameter.kt")
    public void testAnnotationEntryOnParameter() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeProvider/typeReference/annotationEntryOnParameter.kt");
    }

    @Test
    @TestMetadata("annotationEntrySetter.kt")
    public void testAnnotationEntrySetter() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeProvider/typeReference/annotationEntrySetter.kt");
    }

    @Test
    @TestMetadata("annotationOnFunction.kt")
    public void testAnnotationOnFunction() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeProvider/typeReference/annotationOnFunction.kt");
    }

    @Test
    @TestMetadata("functionReceiver.kt")
    public void testFunctionReceiver() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeProvider/typeReference/functionReceiver.kt");
    }

    @Test
    @TestMetadata("functionReturn.kt")
    public void testFunctionReturn() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeProvider/typeReference/functionReturn.kt");
    }

    @Test
    @TestMetadata("propertyReceiver.kt")
    public void testPropertyReceiver() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeProvider/typeReference/propertyReceiver.kt");
    }

    @Test
    @TestMetadata("propertyReturn.kt")
    public void testPropertyReturn() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeProvider/typeReference/propertyReturn.kt");
    }

    @Test
    @TestMetadata("starProjection.kt")
    public void testStarProjection() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeProvider/typeReference/starProjection.kt");
    }

    @Test
    @TestMetadata("superTypeEntry.kt")
    public void testSuperTypeEntry() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeProvider/typeReference/superTypeEntry.kt");
    }

    @Test
    @TestMetadata("superTypeEntry_withTypeArgument.kt")
    public void testSuperTypeEntry_withTypeArgument() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeProvider/typeReference/superTypeEntry_withTypeArgument.kt");
    }

    @Test
    @TestMetadata("typeArgument_functionCall.kt")
    public void testTypeArgument_functionCall() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeProvider/typeReference/typeArgument_functionCall.kt");
    }

    @Test
    @TestMetadata("typeArgument_superTypeEntry.kt")
    public void testTypeArgument_superTypeEntry() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeProvider/typeReference/typeArgument_superTypeEntry.kt");
    }

    @Test
    @TestMetadata("underscoreTypeArgument_inferred.kt")
    public void testUnderscoreTypeArgument_inferred() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeProvider/typeReference/underscoreTypeArgument_inferred.kt");
    }

    @Test
    @TestMetadata("underscoreTypeArgument_reified.kt")
    public void testUnderscoreTypeArgument_reified() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeProvider/typeReference/underscoreTypeArgument_reified.kt");
    }
}
