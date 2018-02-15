package com.iqmsoft.kotlin.rest

import org.jboss.shrinkwrap.api.ShrinkWrap
import org.wildfly.swarm.container.Container
import org.wildfly.swarm.jaxrs.JAXRSArchive


fun main(args: Array<String>) {
    val container = Container()
    
    val deployment = ShrinkWrap.create(JAXRSArchive::class.java, "WildFlySwarmKotlin.war")
    deployment.addClass(KotlinResource::class.java)
    deployment.addAllDependencies()
    container.start().deploy(deployment)
}