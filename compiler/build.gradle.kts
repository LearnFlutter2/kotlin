
import java.io.File
import org.gradle.api.tasks.bundling.Jar

apply { plugin("kotlin") }

jvmTarget = "1.6"

val compilerModules: Array<String> by rootProject.extra
val otherCompilerModules = compilerModules.filter { it != path }

// TODO: it seems incomlete, find and add missing dependencies
val testDistProjects = listOf(
//        ":prepare:mock-runtime-for-test",
        ":kotlin-compiler",
        ":kotlin-runtime",
        ":kotlin-script-runtime",
        ":kotlin-stdlib",
        ":kotlin-stdlib-jre7",
        ":kotlin-stdlib-jre8",
        ":kotlin-stdlib-js",
        ":kotlin-reflect",
        ":kotlin-test:kotlin-test-jvm",
        ":kotlin-test:kotlin-test-junit",
        ":kotlin-test:kotlin-test-js",
        ":kotlin-daemon-client",
        ":android-extensions-compiler",
        ":kotlin-ant")

dependencies {
    testDistProjects.forEach {
        testCompile(projectDist(it))
    }
    testCompile(commonDep("junit:junit"))
//    testCompileOnly(project(":kotlin-test:kotlin-test-jvm"))
//    testCompileOnly(project(":kotlin-test:kotlin-test-junit"))
    testCompile(project(":compiler.tests-common"))
    testCompile(project(":compiler:ir.ir2cfg"))
    testCompile(project(":compiler:ir.tree")) // used for deepCopyWithSymbols call that is removed by proguard from the compiler TODO: make it more straightforward
    testCompile(ideaSdkDeps("openapi", "idea", "util", "asm-all", "commons-httpclient-3.1-patched"))
    // deps below are test runtime deps, but made test compile to split compilation and running to reduce mem req
//    testCompileOnly(project(":kotlin-stdlib"))
//    testCompileOnly(project(":kotlin-script-runtime"))
//    testCompileOnly(project(":kotlin-runtime"))
//    testCompileOnly(project(":kotlin-reflect"))
//    testCompileOnly(project(":android-extensions-compiler"))
//    testCompileOnly(project(":kotlin-ant"))
    otherCompilerModules.forEach {
        testCompileOnly(project(it))
    }
//    testRuntime(files("${rootProject.extra["distLibDir"]}${File.separator}*.jar"))
    testRuntime(ideaSdkCoreDeps("*.jar"))
    testRuntime(ideaSdkDeps("*.jar"))
}

sourceSets {
    "main" {}
    "test" {
        projectDefault()
//        java.srcDir("tests-ir-jvm/tests")
    }
}

val jar: Jar by tasks
jar.apply {
    from(the<JavaPluginConvention>().sourceSets.getByName("main").output)
    from("../idea/src").apply {
        include("META-INF/extensions/common.xml",
                "META-INF/extensions/kotlin2jvm.xml",
                "META-INF/extensions/kotlin2js.xml")
    }
}

testsJar {}

projectTest {
    dependsOn(*testDistProjects.map { "$it:dist" }.toTypedArray())
    workingDir = rootDir
    systemProperty("kotlin.test.script.classpath", the<JavaPluginConvention>().sourceSets.getByName("test").output.classesDirs.joinToString(File.pathSeparator))
}

