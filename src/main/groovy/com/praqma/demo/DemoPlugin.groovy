package com.praqma.demo

import com.praqma.demo.greeting.GreetingModule
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * The plugin's entry point.
 * Reference:
 * https://docs.gradle.org/3.5/userguide/custom_plugins.html#sec:writing_a_simple_plugin
 * Example 41.1
 */
public class DemoPlugin implements Plugin<Project>{

    /**
     * Applies this plugin to the given Gradle project
     * @param project The Gradle project
     */
    void apply(Project project) {
        // Apply all functionality from the GreetingModule
        GreetingModule.load(project)
    }
}
