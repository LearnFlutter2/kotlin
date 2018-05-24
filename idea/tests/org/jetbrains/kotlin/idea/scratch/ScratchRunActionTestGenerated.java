/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.scratch;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class ScratchRunActionTestGenerated extends AbstractScratchRunActionTest {
    @TestMetadata("idea/testData/scratch")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Compiling extends AbstractScratchRunActionTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doCompilingTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInCompiling() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/scratch"), Pattern.compile("^(.+)\\.kts$"), TargetBackend.ANY, false);
        }

        @TestMetadata("for.kts")
        public void testFor() throws Exception {
            runTest("idea/testData/scratch/for.kts");
        }

        @TestMetadata("generics.kts")
        public void testGenerics() throws Exception {
            runTest("idea/testData/scratch/generics.kts");
        }

        @TestMetadata("klass.kts")
        public void testKlass() throws Exception {
            runTest("idea/testData/scratch/klass.kts");
        }

        @TestMetadata("simple.kts")
        public void testSimple() throws Exception {
            runTest("idea/testData/scratch/simple.kts");
        }

        @TestMetadata("simpleFun.kts")
        public void testSimpleFun() throws Exception {
            runTest("idea/testData/scratch/simpleFun.kts");
        }

        @TestMetadata("spacesAtLineStart.kts")
        public void testSpacesAtLineStart() throws Exception {
            runTest("idea/testData/scratch/spacesAtLineStart.kts");
        }

        @TestMetadata("stdlibFun.kts")
        public void testStdlibFun() throws Exception {
            runTest("idea/testData/scratch/stdlibFun.kts");
        }

        @TestMetadata("unresolved.kts")
        public void testUnresolved() throws Exception {
            runTest("idea/testData/scratch/unresolved.kts");
        }

        @TestMetadata("unresolvedMultiline.kts")
        public void testUnresolvedMultiline() throws Exception {
            runTest("idea/testData/scratch/unresolvedMultiline.kts");
        }

        @TestMetadata("userOutput.kts")
        public void testUserOutput() throws Exception {
            runTest("idea/testData/scratch/userOutput.kts");
        }

        @TestMetadata("var.kts")
        public void testVar() throws Exception {
            runTest("idea/testData/scratch/var.kts");
        }

        @TestMetadata("veryLongOutput.kts")
        public void testVeryLongOutput() throws Exception {
            runTest("idea/testData/scratch/veryLongOutput.kts");
        }

        @TestMetadata("when.kts")
        public void testWhen() throws Exception {
            runTest("idea/testData/scratch/when.kts");
        }
    }

    @TestMetadata("idea/testData/scratch")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Repl extends AbstractScratchRunActionTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doReplTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInRepl() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/scratch"), Pattern.compile("^(.+)\\.kts$"), TargetBackend.ANY, false);
        }

        @TestMetadata("for.kts")
        public void testFor() throws Exception {
            runTest("idea/testData/scratch/for.kts");
        }

        @TestMetadata("generics.kts")
        public void testGenerics() throws Exception {
            runTest("idea/testData/scratch/generics.kts");
        }

        @TestMetadata("klass.kts")
        public void testKlass() throws Exception {
            runTest("idea/testData/scratch/klass.kts");
        }

        @TestMetadata("simple.kts")
        public void testSimple() throws Exception {
            runTest("idea/testData/scratch/simple.kts");
        }

        @TestMetadata("simpleFun.kts")
        public void testSimpleFun() throws Exception {
            runTest("idea/testData/scratch/simpleFun.kts");
        }

        @TestMetadata("spacesAtLineStart.kts")
        public void testSpacesAtLineStart() throws Exception {
            runTest("idea/testData/scratch/spacesAtLineStart.kts");
        }

        @TestMetadata("stdlibFun.kts")
        public void testStdlibFun() throws Exception {
            runTest("idea/testData/scratch/stdlibFun.kts");
        }

        @TestMetadata("unresolved.kts")
        public void testUnresolved() throws Exception {
            runTest("idea/testData/scratch/unresolved.kts");
        }

        @TestMetadata("unresolvedMultiline.kts")
        public void testUnresolvedMultiline() throws Exception {
            runTest("idea/testData/scratch/unresolvedMultiline.kts");
        }

        @TestMetadata("userOutput.kts")
        public void testUserOutput() throws Exception {
            runTest("idea/testData/scratch/userOutput.kts");
        }

        @TestMetadata("var.kts")
        public void testVar() throws Exception {
            runTest("idea/testData/scratch/var.kts");
        }

        @TestMetadata("veryLongOutput.kts")
        public void testVeryLongOutput() throws Exception {
            runTest("idea/testData/scratch/veryLongOutput.kts");
        }

        @TestMetadata("when.kts")
        public void testWhen() throws Exception {
            runTest("idea/testData/scratch/when.kts");
        }
    }

    @TestMetadata("idea/testData/scratch/multiFile")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class MultiFile extends AbstractScratchRunActionTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doMultiFileTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInMultiFile() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/scratch/multiFile"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
        }

        @TestMetadata("inlineFun")
        public void testInlineFun() throws Exception {
            runTest("idea/testData/scratch/multiFile/inlineFun/");
        }

        @TestMetadata("javaDep")
        public void testJavaDep() throws Exception {
            runTest("idea/testData/scratch/multiFile/javaDep/");
        }
    }
}
