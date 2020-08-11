package com.github.dllewellyn.baseplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.dllewellyn.baseplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
