package com.github.ccominghome.mvvmtempalte.services

import com.github.ccominghome.mvvmtempalte.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
