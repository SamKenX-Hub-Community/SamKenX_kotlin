// DO NOT EDIT MANUALLY!
// Generated by org/jetbrains/kotlin/generators/arguments/GenerateGradleOptions.kt
// To regenerate run 'generateGradleOptions' task
@file:Suppress("RemoveRedundantQualifierName", "Deprecation", "DuplicatedCode")

package org.jetbrains.kotlin.gradle.dsl

internal object KotlinCommonCompilerOptionsHelper {

    internal fun fillCompilerArguments(
        from: org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerOptions,
        args: org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments,
    ) {
        org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerToolOptionsHelper.fillCompilerArguments(from, args)
        args.apiVersion = from.apiVersion.orNull?.version
        args.languageVersion = from.languageVersion.orNull?.version
        args.optIn = from.optIn.get().toTypedArray()
        args.progressiveMode = from.progressiveMode.get()
        args.useK2 = from.useK2.get()
    }

    internal fun syncOptionsAsConvention(
        from: org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerOptions,
        into: org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerOptions,
    ) {
        org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerToolOptionsHelper.syncOptionsAsConvention(from, into)
        into.apiVersion.convention(from.apiVersion)
        into.languageVersion.convention(from.languageVersion)
        into.optIn.convention(from.optIn)
        into.progressiveMode.convention(from.progressiveMode)
        into.useK2.convention(from.useK2)
    }
}
